package ch08;
/**
 * �ۼ��� : ���߳�
 * �ۼ��� : ����
 * ���� : �׳� �ɽ��ؼ�
 */
/*
 * ��ڻ��
 */

abstract class A1 { //�ϳ��� �߻� �޼ҵ尡 �ִ� Ŭ������ �߻� Ŭ����
	void print () { //�Ϲ� �޼ҵ�
		System.out.println("��ȣ ������!");
	}
	abstract void display();  //�߻� �޼ҵ�
}
class A2 extends A1 {
	void display() {
		System.out.println("���! ���� 14��");
	}	
}
public class Abs01 {
	public static void main(String[] args) {
		A1 a1 = new A2(); //�߻� Ŭ������ ������ �� ����.
		A2 a2 = new A2(); 
	}

}
