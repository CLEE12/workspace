package ch02;
public class Var1 {
	public static void main(String[] args) {
		int a1; // 선언
		a1 = 7;  // =로 a1이라는 가상 공간에 7을 대입한다.
		         // java에서 equal은 == 두개, 대입은 = 하나.
		a1 = a1+10;
		// int 1b;
		int $a = 34; //선언과 대입
		// int @a;
		int b1 = 12;
		
		System.out.println("a1 = "+a1);
		System.out.println("$a = "+$a);
		System.out.println("b1 = "+b1);
	}
}