package ch05;
public class Person1 {
	String name;
	String gender;
	int age;
	Person1(String n, String g, int a) {
		name = n;
		gender = g;
		age = a;
	}
	void print() {
		System.out.println("name : "+name);
		System.out.println("gender : "+gender);
		System.out.println("age : "+age);
		System.out.println("===============");
		}
	public static void main(String[] args) {
		Person1 p1 = new Person1("Marcus","Male",34);
		Person1 p2 = new Person1("Xue","Female",30);
		Person1 p3 = new Person1("Lucio","Man",35);
		p1.print();
		p2.print();
		p3.print();
	}
}
