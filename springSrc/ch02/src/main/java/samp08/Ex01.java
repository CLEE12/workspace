package samp08;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
public class Ex01 {
	public static void main(String[] args) {
		ApplicationContext ac=new GenericXmlApplicationContext(
			"/samp08/beans08.xml");
		ProductService ps = ac.getBean(ProductService.class);
		Product product   = ps.getProduct();
		System.out.println(product);
	}
}