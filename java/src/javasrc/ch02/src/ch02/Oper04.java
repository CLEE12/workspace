package ch02;

public class Oper04 {
	public static void main(String[] args) {
		System.out.println("����������");
		int a = 2;
		int b = a;
		a++;
		
		System.out.println("a = "+a);
		
		b = a++; //a-- -> ���������� -> �����ڿ� ��ġ(postfix)
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		int c = ++a; //�����տ� ��ġ(prefix)
		
		System.out.println("a = "+a);
		System.out.println("c = "+c);
		
	}

}
