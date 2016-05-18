package samp4;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
public class Ex01 {
	public static void main(String[] args) {
		ApplicationContext ac = 
			new FileSystemXmlApplicationContext("bean03.xml");
		Vechicle vh = (Vechicle)ac.getBean("a");
		vh.ride("주민");
	}
}