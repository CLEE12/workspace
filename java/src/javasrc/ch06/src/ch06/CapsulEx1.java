package ch06;
class P1 {
	String name;
	int age;
	void print() {
		System.out.println(name+"�� ���̴� "+age+"�̴�.");;
	}
}
public class CapsulEx1 {
	public static void main(String[] args) {
		P1 p = new P1();
		p.name = "����";
		p.age  = 22;
		p.print();
	}
}
