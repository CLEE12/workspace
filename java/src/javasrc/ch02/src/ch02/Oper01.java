package ch02;

public class Oper01 {
	public static void main(String[] args) {
		
	int a1 = 7, a2 = 7;
	//a1을 b1에 대입하고 a1을 1증가
	int b1 = a1++, b2 = ++a2;
	//a2를 1증가하고 b2에 대입
	
	System.out.println("a1 = "+a1+",b1 = "+b1);
	System.out.println("a2 = "+a2+",b2 = "+b2);
	
	}
}
