package samp5;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Ex01 {
	public static void main(String[] args) {
		ApplicationContext ac = 
			// new ClassPathXmlApplicationContext("/samp5/bean05.xml");
		 new ClassPathXmlApplicationContext("classpath:bean/bean05.xml");
		MessageBean mb = (MessageBean) ac.getBean("mb");
		mb.sayHello();
	}
}