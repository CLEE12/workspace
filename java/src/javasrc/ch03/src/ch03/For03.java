package ch03;

import java.io.IOException;

public class For03 {
	public static void main(String[] args) throws IOException {
		System.out.println("출력할 구구단 ?");
		int num = System.in.read() - 48; //or -'0'
		          System.in.read();
		          System.in.read();
		for (int i = 1; i < 10; i++)
			System.out.println(num+" * "+i+" = "+num*i); }

}
