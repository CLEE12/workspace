package samp10;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import samp10.model.Product;
import samp10.service.ProductService;
public class Ex01 {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
			"/samp10/beans10.xml");
		ProductService bs = ac.getBean(ProductService.class);
		Product product = bs.getProduct();
		System.out.println(product);
	}
}