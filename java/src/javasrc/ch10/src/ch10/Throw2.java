package ch10;

import java.util.Scanner;

public class Throw2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			divide(sc);
		}
		catch(ArithmeticException e) {
			System.out.println("0���� ������"); //static ���ο� throw�� �������� ���� �÷��� ó���ϰ� �����.
		}
		sc.close();
	}
	static void divide(Scanner sc) throws ArithmeticException {
		System.out.println("ù��° ��");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.println("�ι�° ��");
		int num2 = Integer.parseInt(sc.nextLine());
				System.out.printf("%d%d=%d",num1,num2,num1/num2);;
	}
	/*catch(ArithmeticException e) {
		System.out.println("0���� ������");*/ //static���ο� throw AtithmeticException �� �Է��ϹǷ� �ʿ������.
}
