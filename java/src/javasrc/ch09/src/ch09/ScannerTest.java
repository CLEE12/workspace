package ch09;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ƹ��ų� �Է���");
		String str = sc.nextLine();
		System.out.println("�Է��� ���� : "+str);
		sc.close();
	}

}
