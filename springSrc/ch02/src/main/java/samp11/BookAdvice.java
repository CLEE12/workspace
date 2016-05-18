package samp11;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import samp11.model.Book;
@Aspect
public class BookAdvice {
	@Before("execution( * getBook(String))")
	public void before(JoinPoint jp) {
		System.out.println("before시작");
		Signature sign = jp.getSignature();
		System.out.println("신호이름 : "+sign.getName());
		Object[] obj = jp.getArgs();
		System.out.println("매개변수 명 : "+obj[0]);
	}
	@Around("execution( * getBook(String))")
	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("around시작");
		Object rtnObj = pjp.proceed();
		System.out.println("around종료");
		return rtnObj;
	}
	@After("execution( * getBook(String))")
	public void after() {
		System.out.println("after시작");
	}
	@AfterReturning(value="execution( * getBook(String))",
			returning="book")
	public void afterRetn(JoinPoint jp, Book book) {
		System.out.println("after Return시작 : "+book);
	}
	@AfterThrowing(value="execution( * getBook(String))",
			throwing="e")
	public void afterThru(Throwable e) {
		System.out.println("에러발생 : "+e.getMessage());
	}
}