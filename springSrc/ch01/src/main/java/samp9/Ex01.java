package samp9;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Ex01 {
	public static void main(String[] args) {
		ApplicationContext ac = 
			new ClassPathXmlApplicationContext("classpath:bean/bean09.xml");
		Message msg = (Message)ac.getBean("mb");
		msg.sayHello();
	}
}