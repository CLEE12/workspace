package ch05;

class Car5 {
	int x, y; //�ɹ������� ���� ������� 0���� ����.
	Car5() {
		System.out.println("���� �⺻ ������");
	}
	Car5(int a) {
		x = a;
		System.out.println("�Ű����� 1�� : "+a);
	}
	Car5(int a, int b) {
		x = a; y = b;
		System.out.println("�Ű����� 2�� a= "+a+", b= "+b);
	}
}
public class Car5Ex {
	public static void main(String[] args) {
		Car5 c1= new Car5(); // ���ڸ� �Է��ϸ� 12�� �ٿ� �ش��ϴ� ������ ��� ��.
		Car5 c2= new Car5(15);
		Car5 c3= new Car5(23, 56);
		System.out.println("c1.x = "+c1.x+", c1.y = "+c1.y);
		System.out.println("c2.x = "+c2.x+", c2.y = "+c2.y);
		System.out.println("c3.x = "+c3.x+", c3.y = "+c3.y);
	}
}
