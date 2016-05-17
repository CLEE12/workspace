package ch03;

import java.util.Scanner;

public class Sc1 { //스캐너를 쓰면 문자수의 제한이 없다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("글자를 입력하세요");
		String str = sc.nextLine(); //문자열 입력.
		System.out.println("입력한 글자 : "+str);
		sc.close();
	}
}
