package ch07;
class E1 {
	//�����ڰ� 1���� ������ default �����ڰ� �ȸ��������.
	//E1() { System.out.println("�Ű����� ���� �θ�"); }
	E1(int a) { System.out.println("�� �Ű����� 1�� �θ� : "+a); }
}
class E2 extends E1 {
	E2() { 
		super(7); //�Ű����� 7�� ���� �θ�����ڸ� �����Ѵ�
		System.out.println("�Ű����� ���� ������");	}
	
	E2(int b) {	
		super(b);
		System.out.println("�Ű����� 1�� : "+b); }
}
public class Super1 {
	public static void main(String[] args) {
		//E2 e1 = new E2();
		E2 e2 = new E2(15);
	}

}
