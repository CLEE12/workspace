package ch08;
interface E1 {
	void e1();
}
interface E2 {
	void e2();
}
class E3 implements E1, E2 { //�������̽��� ������ ��ӱ����� ����
    public void e2() {
	    System.out.println("������");
}
public void e1() {
		System.out.println("��¼��");
	}
}
public class Inter03 {
	public static void main(String[] args) {
		E3 e2 = new E3();
		e2.e1();
		e2.e2();
		e2.e1();
	}
}