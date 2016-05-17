package ch03;

import java.io.IOException;

public class Do2 {
	public static void main(String[] args) throws IOException {
		System.out.println("구구단 ㄱㄱ : ");
		int sum = System.in.read()-'0', i = 1;
		System.out.println("구구단 "+sum+"단");
		do{ System.out.println(sum+" * "+i+" = "+sum*i);
			i++; // 빼먹지 말자.
			}
		while(i<=9);
	}
	

}
