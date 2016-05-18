package sample13;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sample13.model.Product;
import sample13.service.ProductService;
public class Ex01 {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext(
			"sample13/applicationContext.xml");
		ProductService ps=(ProductService)ac.getBean("ps");
		Product product = ps.getProduct();
		System.out.println(product);
	}
}