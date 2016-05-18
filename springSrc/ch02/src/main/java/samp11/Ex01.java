package samp11;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import samp11.model.Book;
import samp11.service.BookService;
public class Ex01 {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
			"/samp11/beans11.xml");
		BookService bs = ac.getBean(BookService.class);
		Book book = bs.getBook();
		System.out.println(book);
	}
}