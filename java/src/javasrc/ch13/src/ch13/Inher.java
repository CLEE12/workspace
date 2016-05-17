package ch13;
class A1 {
	A1() {}
    A1(String str) {
    	System.out.println(str);
    }
	void a1() {
		System.out.println("대박");
	}
}
class A2 extends A1 {
	public A2() {
		super("에이");
	}
	void a2() {
		System.out.println("사건");
	}
}
public class Inher extends A1 {
	public static void main(String[] args) {
		A2 a = new A2();
		a.a1(); a.a2();
	}

}
