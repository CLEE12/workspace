package samp6;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
public class Ex01 {
	public static void main(String[] args) {
		ApplicationContext ac = 
			// new FileSystemXmlApplicationContext("bean5.xml");
			new ClassPathXmlApplicationContext(
					"classpath:/bean/bean05.xml");
		Vechicle vh = (Vechicle)ac.getBean("vh");
		vh.ride();
	}
}
