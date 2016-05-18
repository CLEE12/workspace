package samp09;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Ex01 {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
			"/samp09/beans09.xml");
		BookService bs = ac.getBean(BookService.class);
		Book book = bs.getBook();
		System.out.println(book);
	}
}