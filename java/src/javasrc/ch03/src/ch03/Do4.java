package ch03;

import java.io.IOException;

public class Do4 {
	public static void main(String[] args) throws IOException {
		int num = 0;
		do {
		    System.out.println("¦���� �Է��ϼ���."); 
	 	    num = System.in.read() -48;
	 	    System.in.read(); //CR \r
	 	    System.in.read(); //LF \n
		} while(num%2!=0);
	 	System.out.println("�Է��� ¦�� : "+num);
		
	}

}
