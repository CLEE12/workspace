package ch07;
class J1 {
	String a = "��ī�� ���� �߽��ϴ�.";
	J1() {
		System.out.println("���� : �ᳪ�� ���");
	}
	void aa() {
		System.out.println("���� : �̰ɷ� ��!");
	}
}
class J2 extends J1 {
	String a = "������ ���� �����ֽ��ϴ�."; //int a = 56�� ������� �ؿ� �ִ� aa();�� super.�� ���� ���� ��� int a = 11�� ����.
	J2() {
		System.out.println("�� : ���±濡 �����ϳ� �������!");
	}
	void aa() {
		System.out.println("�� : ���� ����!");
	}
	void bb() {
		aa(); //super.aa �ϸ� J1���� ��������, �׳� �ϸ� ����� ���� �����´�.
		System.out.println("a = "+a);
		//System.out.println("a = "+super.a); <- ������ ���ٳ��� ���.
	}
}
public class Super5 {
	public static void main(String[] args) {
		J2 j = new J2();
		j.bb();
	}

}
