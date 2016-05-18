package samp02;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
public class Ex01 {
	public static void main(String[] args) {
		ApplicationContext ac=new GenericXmlApplicationContext(
			"/samp02/beans02.xml"); 
		MessageBean mb = (MessageBean)ac.getBean("proxy");
		mb.sayHello();
	}
}