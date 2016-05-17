package ch09;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("아무거나 입력해");
		String str = sc.nextLine();
		System.out.println("입력한 내용 : "+str);
		sc.close();
	}

}
