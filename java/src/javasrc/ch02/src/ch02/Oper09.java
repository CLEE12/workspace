package ch02;

public class Oper09 {
	public static void main(String[] args) {
		int i1 = 1000000, i2 = 2000000;
		long l1 = (long)i1 * i2; 
		/*int�� ����ϸ� err�� �ȳ����� ������ ���� ����. 
		int�� 21����� �����ѵ� 145���� ����.
		�׷��� (long)�� �ٿ��� ����ȯ.*/
		System.out.println("l1 = "+l1);
		
	}

}
