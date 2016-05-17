package ch02;

public class Oper06 {
	public static void main(String[] args) {
		int a1 = 10, a2 = 5;
		a1 += a2; //a1 = a1 + a2; a1 = 15, a2 = 5
		System.out.println("a1 = "+a1+", a2 = "+a2);
		
		a1 -= a2; //a1 = a1 - a2; a1 = 10, a2 = 5
		System.out.println("a1 = "+a1+", a2 = "+a2);
		
		a1 *= a2; //a1 = a1 * a2; a1 = 50
		System.out.println("a1 = "+a1+", a2 = "+a2);
		
		a1 /= a2; //a1 = a1 / a2; a1 = 10
		System.out.println("a1 = "+a1+", a2 = "+a2);
		
		a1 %= a2; // a1 = a1 % a2; a1 = 0
		System.out.println("a1 = "+a1+", a2 = "+a2);
		
	}

}
