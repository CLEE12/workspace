package ch06;

import java.util.Scanner;

public class Fact2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("보고싶은 팩토리얼 숫자는 ?");
		int x = sc.nextInt();
		int result = 1;
		
		for(int i=x; i>=1; i--) {
			if(i>1) {
				System.out.print(i+" * ");
			    result *= i;
			}else {
				System.out.println(i+" = "+result);
		    }
	    }sc.close();
	}
}