package ch03;

import java.util.Scanner;

public class Sc1 { //��ĳ�ʸ� ���� ���ڼ��� ������ ����.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		String str = sc.nextLine(); //���ڿ� �Է�.
		System.out.println("�Է��� ���� : "+str);
		sc.close();
	}
}
