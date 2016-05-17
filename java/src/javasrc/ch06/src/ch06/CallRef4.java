package ch06;
class D1 { 
	int a, b;
	}

public class CallRef4 {
	public static void main(String[] args) {
		D1 c = new D1();
		c.a = 7;
		c.b = 15;
		swap(c);
		System.out.println("메인");
		System.out.println("a = "+c.a);
		System.out.println("b = "+c.b);
	}

	static void swap(D1 k) {
		int t = k.a; 
		  k.a = k.b; 
		  k.b = t;
		System.out.println("변경 값");
		System.out.println("a = "+k.a);
		System.out.println("b = "+k.b);

}
}
