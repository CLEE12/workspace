package ch13;
class A1 {
	A1() {}
    A1(String str) {
    	System.out.println(str);
    }
	void a1() {
		System.out.println("���");
	}
}
class A2 extends A1 {
	public A2() {
		super("����");
	}
	void a2() {
		System.out.println("���");
	}
}
public class Inher extends A1 {
	public static void main(String[] args) {
		A2 a = new A2();
		a.a1(); a.a2();
	}

}
