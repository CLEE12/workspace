package sample14;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sample14.model.Book;
import sample14.service.BooKService;
public class Ex01 {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext(
			"/sample14/applicationContext.xml"); 
		BooKService bs = ac.getBean(BooKService.class);
		Book book = bs.getBook();
		System.out.println(book);
	}
}