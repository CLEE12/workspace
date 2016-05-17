package ch02;

public class Oper07 {
	public static void main(String[] args) {
		int i1 = 10, i2 = 7;
		System.out.println("i1 = "+i1+", i2 = "+i2);
		System.out.println("i1 += i2 = "+(i1+=i2));
		
		boolean b1 = i1 > i2;
		System.out.println("b1 = "+(i1>i2));
		boolean b2 = i1 != i2;
		System.out.println("b2 = "+(i1!=i2));
		
		boolean b3 = i1 <= i2;
		System.out.println("b3 = "+(i1<=i2));
		System.out.println("b1 && b2 = "+(b1&&b2));
		System.out.println("b1 || b2 = "+(b1||b2));
		
	}

}
