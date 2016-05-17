package ch06;
class B3 {
	int x, y;
	void bb(B3 a) {
		a.x += 10;
		a.y += 2;
		System.out.println("연산결과");
		System.out.println("x = "+a.x);
		System.out.println("y = "+a.y);
	}
}
public class Callref2 {
	public static void main(String[] args) {
		B3 b = new B3();
		b.x = 8;
		b.y = 10;
		b.bb(b);
		System.out.println("메인");
		System.out.println("x = "+b.x);
		System.out.println("y = "+b.y);
	}

}
