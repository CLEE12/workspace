package samp04;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;
public class LoggingSample {
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