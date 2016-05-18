package ch04;
import java.util.List;
import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class HiEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("id를 입력하세요");
		String id = sc.nextLine();
		System.out.println("이름을 입력하세요");
		String name = sc.nextLine();
		ApplicationContext ac=new ClassPathXmlApplicationContext(
			"classpath:hibernate.xml");
		Person person = new Person(id,name);
		PersonService ps = ac.getBean(PersonService.class);
	//	ps.addPerson(person);
		List<Person> list = ps.findList();		
		for (Person p : list) {
			System.out.println("id="+p.getId()+", 이름="+p.getName());
		}
		System.out.println("===============");		
		List<Person> list2  = ps.findList(id);
		for (Person p : list2) {
			System.out.println("id="+p.getId()+", 이름="+p.getName());
		}		
		System.out.println("===============");
		ps.updatePerson(person);
		Person p1 = ps.get(id);
		System.out.println("id="+p1.getId()+", 이름="+p1.getName());
		System.out.println("===============");
		ps.removePerson(person);
		list = ps.findList();		
		for (Person p : list) {
			System.out.println("id="+p.getId()+", 이름="+p.getName());
		}
		sc.close();
	}
}