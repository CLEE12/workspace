package samp06;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.util.StopWatch;
@Aspect
public class LoggingSample {
	@Around("execution(* sayHello())")
	public Object logAround(ProceedingJoinPoint pjp) 
			throws Throwable {
		String name = pjp.getKind();
		StopWatch sw = new StopWatch();
		sw.start(name);
		System.out.println("작업 시작 : 로그 찍었다");
		
		Object rtnObj = pjp.proceed();
		
		sw.stop();
		System.out.println("작업끝 : "+sw.getTotalTimeSeconds()+"초 걸렸다");
		return rtnObj;
	}
}