package ch08;
abstract class B1 {
	int a1;
	void setA1(int a1) {
		this.a1=a1;
	}// overridinge�� ��� �Ű������� �θ�� ���ƾ� ��.
	public abstract void cal(); /* {
		System.out.println("a1�� ���� : "+a1*a1);
	}*/ //abstract�� ���鼭 ����
}
class B2 extends B1 {
	public void cal() { //�θ� public�̸� �ڽ��� �ּ��� ũ�ų� ���ƾ� �Ѵ�.
		System.out.println("a1�� ���� : "+a1*a1);
	}
}
public class Abs02 {
	public static void main(String[] args) {
		B1 b1 = new B2();
		b1.setA1(7);
		b1.cal();
	}

}
