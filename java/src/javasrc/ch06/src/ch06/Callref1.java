package ch06;
class B2 {
	void aa(int[] x) {
		x[0] += x[1];
		x[1] += 2;
		System.out.println("연산결과");
		System.out.println("x[0] = "+x[0]);
		System.out.println("x[1] = "+x[1]);
	}
}

public class Callref1 {
	public static void main(String[] args) {
		B2 b = new B2();
		int[] x = {10,8};
		b.aa(x); // call by reference
		System.out.println("메인");
		System.out.println("x[0] = "+x[0]);
		System.out.println("x[1] = "+x[1]);
	}

}
