package ch10;

import java.util.Scanner;

public class Gugu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("출력할 구구단은 ?");
		    try {
		    	int num = Integer.parseInt(sc.nextLine());
		    	if (num == 0 || num == 1 || num > 9) break;
		    	else {
		    		for(int i=0; i<=9; i++) {
		    			System.out.println(num+" * "+i+" = "+num*i);
		    		}
		    	}
		    }
		    catch(NumberFormatException e) {
		    	System.out.println("숫자가 아닙니다");
		    }
			finally {
				System.out.println("일단 출력했어"); 
			}
		}
		while(true);
		sc.close();
}
}
