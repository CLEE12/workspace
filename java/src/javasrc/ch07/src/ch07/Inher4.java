package ch07;
class D1 {
	int x; //private int y�� ����� �ȵ�. private ����
	//private int y;
	int y;
	void set(int x, int y) {
		
	}
}
class D2 extends D1 {
	void cal() {
		System.out.println("�հ� : "+(x+y));
	}
}
public class Inher4 {
	public static void main(String[] args) {
		D2 d2 = new D2();
		d2.set(12,34);
		d2.cal();
	}

}
