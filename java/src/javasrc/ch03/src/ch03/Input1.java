package ch03;

import java.io.IOException;

public class Input1 {
	public static void main(String[] args) throws IOException {
		System.out.println("���� ���ڸ� �Է��ϼ���");
		int a = System.in.read(); //System.in.read(); == input
		//a�� -48�̳� '0'�� �߰��ϸ� �Է��� ���� ���´�.
		System.out.println("a = "+a);
		// cmd���� �����ϸ� ASCII ���� ����.
	}

}
