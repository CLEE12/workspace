package ch07;
class C1 {
	int a = 7;
	C1() {System.out.println("�� ����"); }
	void c1() {System.out.println("���� �޼ҵ�"); }
}
class C2 extends C1 {
	C2() {System.out.println("�� �θ�"); }
	void c2() {System.out.println("���"); }
}
class C3 extends C2 {
	C3() {System.out.println("�� �ڽ�"); }
}
public class Inher3 {
	public static void main(String[] args) {
		C3 c = new C3();
		c.c1();
		c.c2();
		System.out.println("a = "+c.a);
	}
}
