package ch06;
class C1 {
	int a, b;
	void swap(C1 c) {
		int t = c.a; 
		  c.a = c.b; 
		  c.b = t;
		System.out.println("변경 값");
		System.out.println("a = "+c.a);
		System.out.println("b = "+c.b);
	}
	
}
public class CallRef3 {
	public static void main(String[] args) {
		C1 c = new C1();
		c.a = 7;
		c.b = 15;
		c.swap(c);
		System.out.println("메인");
		System.out.println("a = "+c.a);
		System.out.println("b = "+c.b);
	}

}
