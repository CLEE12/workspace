package ch03;

import java.util.Scanner;

public class Game1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 1;
		int num = (int)(Math.random() * 100) + 1; //1~100����.
		do {
			System.out.println("1 ~ 100 ���� ���ڸ� �Է��ϼ���.");
			int i = sc.nextInt();
			if (i == num) {
				System.out.println(cnt+"���� ������ϴ�. ����!");
				break; //�ݺ����� ���.
			} else if (i > num) {
				System.out.println("Down!");
			} else 
				System.out.println("Up!");
			    cnt++;
		}while(true); //do while true�� ������ ���̶� ������ ����.
		sc.close();
	}

}
