package ch02;

public class Oper01 {
	public static void main(String[] args) {
		
	int a1 = 7, a2 = 7;
	//a1�� b1�� �����ϰ� a1�� 1����
	int b1 = a1++, b2 = ++a2;
	//a2�� 1�����ϰ� b2�� ����
	
	System.out.println("a1 = "+a1+",b1 = "+b1);
	System.out.println("a2 = "+a2+",b2 = "+b2);
	
	}
}
