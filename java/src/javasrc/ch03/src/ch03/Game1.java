package ch03;

import java.util.Scanner;

public class Game1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 1;
		int num = (int)(Math.random() * 100) + 1; //1~100까지.
		do {
			System.out.println("1 ~ 100 사이 숫자를 입력하세요.");
			int i = sc.nextInt();
			if (i == num) {
				System.out.println(cnt+"번에 맞췄습니다. 축하!");
				break; //반복문을 벗어남.
			} else if (i > num) {
				System.out.println("Down!");
			} else 
				System.out.println("Up!");
			    cnt++;
		}while(true); //do while true는 조건이 참이라 끝나지 않음.
		sc.close();
	}

}
