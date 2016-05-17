package ch10;

import java.util.Scanner;

public class Throw2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			divide(sc);
		}
		catch(ArithmeticException e) {
			System.out.println("0으로 못나눠"); //static 라인에 throw가 들어갔음으로 위로 올려서 처리하게 만든다.
		}
		sc.close();
	}
	static void divide(Scanner sc) throws ArithmeticException {
		System.out.println("첫번째 수");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.println("두번째 수");
		int num2 = Integer.parseInt(sc.nextLine());
				System.out.printf("%d%d=%d",num1,num2,num1/num2);;
	}
	/*catch(ArithmeticException e) {
		System.out.println("0으로 못나눠");*/ //static라인에 throw AtithmeticException 을 입력하므로 필요없어짐.
}
