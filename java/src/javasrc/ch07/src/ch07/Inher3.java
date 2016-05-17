package ch07;
class C1 {
	int a = 7;
	C1() {System.out.println("난 조상"); }
	void c1() {System.out.println("조상 메소드"); }
}
class C2 extends C1 {
	C2() {System.out.println("난 부모"); }
	void c2() {System.out.println("대박"); }
}
class C3 extends C2 {
	C3() {System.out.println("난 자식"); }
}
public class Inher3 {
	public static void main(String[] args) {
		C3 c = new C3();
		c.c1();
		c.c2();
		System.out.println("a = "+c.a);
	}
}
