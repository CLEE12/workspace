package ch03;

import java.io.IOException;

public class Do2 {
	public static void main(String[] args) throws IOException {
		System.out.println("������ ���� : ");
		int sum = System.in.read()-'0', i = 1;
		System.out.println("������ "+sum+"��");
		do{ System.out.println(sum+" * "+i+" = "+sum*i);
			i++; // ������ ����.
			}
		while(i<=9);
	}
	

}
