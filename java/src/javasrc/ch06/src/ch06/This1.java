package ch06;
class F1 {
	int a;
	F1() {
		System.out.println("�Ű����� ����");
	}
	F1(int a) {
		this(); //�Ű������� blank�̱� ������ ����. //this()�� �� ������(F1)�� �� ó���� �־�� �Ѵ�.
		this.a=a;
		System.out.println("�Ű����� a = "+a);
	}
	F1(int a, int b) {
		this(a); //�Ű������� 1���� �ٸ� ������ ȣ��
		System.out.println("�Ű����� 2 a = "+a+",b = "+b);
	}
}

public class This1 {
	public static void main(String[] args) {
		F1 f1 = new F1(45,3);
		System.out.println("a = "+f1.a);
	}
}
