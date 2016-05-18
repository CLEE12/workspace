package sample12;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Ex01 {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext(
			"/sample12/bean12.xml");
		BookService bs = (BookService)ac.getBean("bs");
		Book book   = bs.getBook();
		System.out.println(book);
	}
}