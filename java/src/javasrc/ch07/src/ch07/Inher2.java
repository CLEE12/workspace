package ch07;
class B1 {
	int a = 5;
	B1() {
		System.out.println("�� B1 �����ھ�");
	}
	void bb1() {
		System.out.println("�� B1�� �޼ҵ��");
	}
}
class B2 extends B1 {
	int b = 7;
	B2() {
		System.out.println("�� B2 �����ھ�");
	}
	void bb2() {
		System.out.println("�� B2�� �޼ҵ��");
	}
}

public class Inher2 {
	public static void main(String[] args) {
	B2 b2 = new B2();
	b2.bb1();
	b2.bb2();
	System.out.println("a = "+b2.a);
	System.out.println("b = "+b2.b);
	}
}
