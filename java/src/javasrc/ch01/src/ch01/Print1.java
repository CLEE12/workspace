package ch01;

public class Print1 {
	public static void main(String[] args) {
		System.out.println("대박");
		System.out.println("사건");
		System.out.println("=============");
		System.out.print("대박");
		System.out.println("사건");
		System.out.println("=============");
		// %s는 문자열, %d는 숫자
		System.out.printf("%s %d", "뭐야",23);
	}
}