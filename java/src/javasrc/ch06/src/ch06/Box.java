package ch06;

class E2 {
	void volume1(int a, int b, int c) {
		System.out.println("Volume1�� ���Ǵ� : "+a*b*c);
	}
	void volume2(float a, float b, float c) {
		System.out.printf("Volume2�� ���Ǵ� : %.2f\n",a*b*c);
	}
	void volume3(int a, int b, double c) {
		System.out.printf("Volume3�� ���Ǵ� : %.2f\n",a*b*c);
	}
}
public class Box {
	public static void main(String[] args) {
		E2 e = new E2();
		e.volume1(10,20,30);
		e.volume2(2.4f,3.6f,5.12f); //long, float�� ���ͷ��� ����� ����.
		e.volume3(32,43,2.56);
	}
}
