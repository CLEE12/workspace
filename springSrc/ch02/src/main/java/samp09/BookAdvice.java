package samp09;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
public class BookAdvice {
	public void before(JoinPoint jp) {
		System.out.println("before시작");
		Signature sign = jp.getSignature();
		System.out.println("신호이름 : "+sign.getName());
		Object[] obj = jp.getArgs();
		System.out.println("매개변수 명 : "+obj[0]);
	}
	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("around시작");
		Object rtnObj = pjp.proceed();
		System.out.println("around종료");
		return rtnObj;
	}
	public void after() {
		System.out.println("after시작");
	}
	public void afterRetn(JoinPoint jp, Book book) {
		System.out.println("after Return시작 : "+book);
	}
	public void afterThru(Throwable e) {
		System.out.println("에러발생 : "+e.getMessage());
	}
}