package ch02;

public class Oper11 {
	public static void main(String[] args) {
		char c1 = 'c'; //char�� ''�� �Է��� ����ȭ ������� ��.
		char c2 = (char)(c1 + 1);
		//char c2 = c1 + 1 -> char�� ����ȯ�� ����� ��.
		System.out.println("c2 = "+c2);
		
		char c3 = ++c1;
		//++�� �Է������μ� int�������� ��ȯ�� �ƴ� ASCII �ڵ带 ����ؼ� (char)�� �Է����� �ʾƵ� ��. 
		System.out.println("c3 = "+c3);
		
		int i1 = 'c' - 'a'; // ���ĺ� a�� c�� �ش��ϴ� ASCII �ڵ� ���� ��.
		int i2 = '8' - '0'; // ���� 8�� 0�� �ش��ϴ� ASCII �ڵ� ���� ��.
		int i3 = '0'; // ASCII �ڵ� '0'�� 48
		System.out.println("i1 = "+i1);
		System.out.println("i2 = "+i2);
		System.out.println("i3 = "+i3);
		
	}

}
