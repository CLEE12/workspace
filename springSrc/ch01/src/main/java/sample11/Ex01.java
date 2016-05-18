package sample11;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Ex01 {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext(
			"classpath:bean/bean09.xml");
		//  "classpath:bean/bean11.xml");
		ProductService ps = (ProductService)ac.getBean("ps");
		Product product = ps.getProduct();
		System.out.println(product);
	}
}