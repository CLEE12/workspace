package samp10;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import samp10.model.Product;
@Aspect
public class AspectAdvice {
	@Before("execution(* getProduct(String))")
	public void before(JoinPoint jp) {
		System.out.println("before작동");
		Signature sn = jp.getSignature();
		Object[] obj = jp.getArgs();
		System.out.println("메소드명 : " +sn.getName());
		System.out.println("매개변수 : " +obj[0]);
	}
	@Around("execution(* getProduct(String))")
	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("around시작");
		Object rtnObj = pjp.proceed();
		System.out.println("around종료");
		return rtnObj;
	}
	@After("execution(* getProduct(String))")
	public void after() {
		System.out.println("after작동");
	}
	@AfterReturning(value="execution(* getProduct(String))",
			returning="product")
	public void afterReturn(JoinPoint jp,Product product) {
		System.out.println("after return에서 출력 : "+product);
	}
	@AfterThrowing(value="execution(* getProduct(String))",
			throwing="e")
	public void afterThrow(Throwable e)  {
		System.out.println("헐 에러 : "+e.getMessage());
	}
}