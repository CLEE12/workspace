package ch07;
public class Person2Ex {
	public static void main(String[] args) {
		Person2[] ps = new Person2[5];
		ps[0] = new Student2("½Â±â", 23, 2);
		ps[1] = new Student2("¼ÒÁö¼·", 35, 3);
		ps[2] = new Teacher2("À¯Àç¼®", 41, "Java");
		ps[3] = new Teacher2("±è±¸¶ó", 43, "JSP");
		ps[4] = new Manager2("¼öÁö", 23, "È«º¸");
		
		for (Person2 p:ps) {
			p.print();
			if(p instanceof Teacher2)
				System.out.println("±×³É");
		}
		
	}
}