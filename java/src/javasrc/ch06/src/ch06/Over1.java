package ch06;
class E1 {
	void add(int a, int b) {
		System.out.println("합계 : "+(a+b));
	}
	void add(int a) {
		System.out.println("합계 : "+(a+a));		
    }
	void add(double x, double y) {
		System.out.printf("합계 : %.2f\n",x+y);
	}
}
public class Over1 {
	public static void main(String[] args) {
		E1 e = new E1();
		e.add(12, 16);
		e.add(7);
		e.add(3.6,2.7);
	}

}
