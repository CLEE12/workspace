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
		Person p1 = new Person(1111, "����", "������");
		Person p2 = new Person(1111, "AOA���", "������");
		Person p3 = new Person(2222, "����", "������");
		if(p1.equals(p2)) System.out.println("���� ����̾�");
		else System.out.println("�ٸ� ����ϰ�");
		if(p1.equals(p3)) System.out.println("���� ����̾�");
		else System.out.println("�ٸ� ����ϰ�");
	}

}
