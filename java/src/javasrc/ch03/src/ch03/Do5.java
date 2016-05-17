package ch03;

import java.io.IOException;

public class Do5 {
	public static void main(String[] args) throws IOException {
		int num = 0, i = 1;
		do {
			System.out.print("\n구구단 : ");
			num = System.in.read() - 48;
			System.in.read();
			System.in.read();
			if (num >=2 && num <=9) {
				do{
					System.out.println(num+" * "+i+" = "+num *i);
					i++;
				}while(i <= 9);
				i = 1;
			}else {System.out.println("ㅗㅗ.\n"); }				
			}while(num != 0);
			System.out.println("종료");
		}
	}


