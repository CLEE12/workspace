package ch16;
import java.io.*;
public class File1Ex {
	public static void main(String[] args) {
/*		File dir = new File(".");
		File dir = new File("src/ch16");
		File dir = new File("src/ch16");
		File dir = new File("../ch15");
		File dir = new File("../../");*/
		
		File dir = new File("src/ch16"); //
		String[] list = dir.list();
		for(int i=0; i<list.length; i++) {
			System.out.println(list[i]);
		}
	}
}
/*
�����κ��� ����ΰ� ���� �߿��ϴ�.
1.����� :  ���� ��ġ�� �������� ã�ư�  c-java-javaSrc-ch15-src-ch15
                                                -ch16-src-ch16
2.������ : ��Ʈ�� �������� ã��

*/