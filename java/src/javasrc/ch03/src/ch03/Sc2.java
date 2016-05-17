package ch03;

import java.util.Scanner;

public class Sc2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민등록번호 13자리를 입력하세요.\n[-빼고 인마]");
		int num = sc.nextInt(); //숫자 입력
		System.out.println("숫자 : "+num);
		sc.close();
	}

}
