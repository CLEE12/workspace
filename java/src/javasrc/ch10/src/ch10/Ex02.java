package ch10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		int num1 = 0,num2 = 0;
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.println("press any first number");
		num1 = sc.nextInt();
		System.out.println("press for second number");
		num2 = sc.nextInt();
		System.out.printf("%d / %d = %d\n", num1, num2, num1/num2);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
/*	\
		catch(ArithmeticException e) {
			System.out.println("0���� ������");
		}
		
		catch(InputMismatchException e) {
			System.out.println("�װ� ���ڳ�?");
		}*/
		
		sc.close();
	}
}
