package ch02;

public class OperTestRelational {
	public static void main(String[] args) {
		byte a =20;
		double d = 3.14;
		boolean fag;
		
		fag = a > d;
		System.out.println("a�� d���� ū��? "+fag);
		
		fag = a == 20.0f; //�� 20.0f��?
		System.out.println("a�� 20.0f�� ������? "+fag);
		
		fag = 10 != 10;
		System.out.println("10�� 10�� ���� ������? "+fag);
		
		fag = 10 <= 20;
		System.out.println("10�� 20���� �۰ų� ������? "+fag);
		
	}

}
