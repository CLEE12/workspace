package ch03;

import java.io.IOException;

public class While3 {
	public static void main(String[] args) throws IOException {
		System.out.println("출력할 구구단은 ?");
		int num = System.in.read() - '0';
		int a = 1;
		System.out.println("구구단 "+num+"단");
	    while (a <= 20) {
	    	//System.out.println(num+" * "+a+" = "+(num*a));
	    	System.out.printf("%d * %d = %d\n", num,a,num*a);
	    	a++;
	    }
	}
}