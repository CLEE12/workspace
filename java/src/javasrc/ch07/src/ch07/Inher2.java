package ch07;
class B1 {
	int a = 5;
	B1() {
		System.out.println("난 B1 생성자야");
	}
	void bb1() {
		System.out.println("난 B1의 메소드야");
	}
}
class B2 extends B1 {
	int b = 7;
	B2() {
		System.out.println("난 B2 생성자야");
	}
	void bb2() {
		System.out.println("난 B2의 메소드야");
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
