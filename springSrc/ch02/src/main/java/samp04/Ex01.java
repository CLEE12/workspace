package samp04;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
public class Ex01 {
	public static void main(String[] args) {
		ApplicationContext ac=new GenericXmlApplicationContext(
			"/samp04/beans04.xml");
		MessageBean mb = (MessageBean)ac.getBean("mb");
		mb.sayHello();
	}
}