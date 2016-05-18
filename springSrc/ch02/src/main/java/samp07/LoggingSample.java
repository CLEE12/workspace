package samp07;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.util.StopWatch;
@Aspect
public class LoggingSample {
	@Around("execution(* ride())")
	public Object logAround(ProceedingJoinPoint pjp) throws Throwable {
		String name = pjp.getKind();
		StopWatch sw = new StopWatch();
		sw.start(name);
		System.out.println("작업 시작");
		Object rtnObj = pjp.proceed();
		sw.stop();
		System.out.println("작업종료 시간 : "+sw.getTotalTimeSeconds());
		return rtnObj;
	}
}