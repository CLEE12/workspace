package samp08;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
public class AspectAdvice {
	public void before(JoinPoint jp) {
		System.out.println("before작동");
		Signature sn = jp.getSignature();
		Object[] obj = jp.getArgs();
		System.out.println("메소드명 : " +sn.getName());
		System.out.println("매개변수 : " +obj[0]);
	}
	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("around시작");
		Object rtnObj = pjp.proceed();
		System.out.println("around종료");
		return rtnObj;
	}
	public void after() {
		System.out.println("after작동");
	}
	public void afterReturn(JoinPoint jp,Product product) {
		System.out.println("after return에서 출력 : "+product);
	}
	public void afterThrow(Throwable e)  {
		System.out.println("헐 에러 : "+e.getMessage());
	}
}