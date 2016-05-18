package samp3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
public class Ex01 {
	public static void main(String[] args) {
		ApplicationContext ac =
			new FileSystemXmlApplicationContext("bean03.xml");
		// MessageBean mb = ac.getBean("mb", MessageBean.class);
		// MessageBean mb = (MessageBean)ac.getBean("mb");
		MessageBean mb = ac.getBean(MessageBean.class);
		mb.sayHello("광영");
	}
}