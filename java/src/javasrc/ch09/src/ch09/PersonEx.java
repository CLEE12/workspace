package ch09;
class Person {
	int no;
	String name;
	String addr;
	Person(int no, String name, String addr) {
		this.no = no; this.name = name; this.addr = addr;
	}
	public boolean equals(Person obj) {
		boolean a = false;
		if (no == obj.no) a = true;
		return a;
	}
}
public class PersonEx {
	public static void main(String[] args) {
		Person p1 = new Person(1111, "설현", "논현동");
		Person p2 = new Person(1111, "AOA멤버", "논현동");
		Person p3 = new Person(2222, "설현", "논현동");
		if(p1.equals(p2)) System.out.println("같은 사람이야");
		else System.out.println("다른 사람일걸");
		if(p1.equals(p3)) System.out.println("같은 사람이야");
		else System.out.println("다른 사람일걸");
	}

}
