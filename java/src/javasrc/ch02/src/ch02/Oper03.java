package ch02;

public class Oper03 {
	public static void main(String[] args) {
		int a1 = 5, a2 = 7;
		int b1 = 2* --a1 + 2* a2--;
		
		System.out.println("a1 = "+a1+", a2 = "+a2+", b1 = "+b1);
		
		
		
		int num1 = 7;
		int num2, num3;
		num2 = num1++;
		num3 = num1--;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num1);
	}

}