package ch02;

public class Oper02 {
	public static void main(String[] args) {
		int a1 = 5, a2 = 5;
		int b1 = --a1, b2 = a2--;
		//a1�� 4�� �ǰ�, b1�� ����.
		//a2fmf b2�� �����ϰ�, a2���� 1 ����.
		
		System.out.println("a1 = "+a1+", b1 = "+b1);
		System.out.println("a2 = "+a2+", b2 = "+b2);

	}

}
