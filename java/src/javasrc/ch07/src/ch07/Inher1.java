package ch07;

class A1 {
	int a = 5;
	A1() {
		System.out.println("抄 何葛积己磊具");
	}
	void aa() {
		System.out.println("抄 何葛 皋家靛具");
	}
}
class A2 extends A1 {
	int b = 7;
	A2() {
		System.out.println("抄 磊侥 积己磊具");
	}
}
public class Inher1 {
	public static void main(String[] args) {
		A2 a2 = new A2();
		a2.aa();
		System.out.println("a = "+a2.a);
		System.out.println("b = "+a2.b);
	}
}
