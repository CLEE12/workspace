package samp01;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
public class Ex01 {
	public static void main(String[] args) {
		ApplicationContext ac=
			// new ClassPathXmlApplicationContext(
			new GenericXmlApplicationContext(
				"/samp01/beans01.xml");
		// MessageBean mb = (MessageBean)ac.getBean("message");
		MessageBean mb = ac.getBean(MessageBean.class);
		mb.sayHello();
	}
}