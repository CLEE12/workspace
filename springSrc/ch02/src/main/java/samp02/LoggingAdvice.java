package samp02;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.util.StopWatch;
public class LoggingAdvice implements MethodInterceptor {
	public Object invoke(MethodInvocation mi) throws Throwable {
		String name = mi.getMethod().getName();
		StopWatch sw = new StopWatch();
		sw.start(name);
		System.out.println(name+" 시작");
		Object rtnObj = mi.proceed();
		sw.stop();
		System.out.println(name+" 종료");	
		System.out.println("작업시간: "+sw.getTotalTimeSeconds()+"초");	
		return rtnObj;
	}
}