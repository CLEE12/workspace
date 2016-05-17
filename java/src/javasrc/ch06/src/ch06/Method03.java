package ch06;

class A3 {
	void aa(int a) {
		System.out.println("a = "+a);
	}
	void bb(int b, String s) {
		System.out.println("b = "+b);
		System.out.println("s = "+s);
	}
}

public class Method03 {
	public static void main(String[] args) {
		A3 a = new A3();
		a.aa(12);
		a.bb(54,  "³¯¾¾ Ãä³×");
	}
}