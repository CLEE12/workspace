package ch03;

import java.util.Scanner;

public class Sc2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ֹε�Ϲ�ȣ 13�ڸ��� �Է��ϼ���.\n[-���� �θ�]");
		int num = sc.nextInt(); //���� �Է�
		System.out.println("���� : "+num);
		sc.close();
	}

}
