package ch08;

interface C1 { //interface������ ;�� �Ϲ������� ��� ��.
	void print();
	public abstract void cal(); //interface�� public abstract�� �����Ȱ�. �����ص� ���� �뵵�� ��� ����.
}
class C2 implements C1 {
	public void print() {
	    System.out.println("������ ���");
	}
	public void cal() {
		System.out.println("���ɽð����� �󸶳� ������?");
	} //interface�� extends��� implements�� ����Ѵ�.
	
}
public class Inter01 {
	public static void main(String[] args) {
		C1 c1 = new C2();
		c1.print();
		c1.cal();
	}
}
