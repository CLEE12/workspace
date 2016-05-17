package ch08;
interface D1 { //���������� interface�� �� ������.
	int a = 7; // <--final
	void display();

}
interface D2 {
	void print();

}
interface D3 extends D1, D2 { //interface������ extends��  ���߻�� ����.
	void aa();
	
}
class D4 implements D3 { //class���� interface�� ��ӹ����� implements.
	public void display() {
		System.out.println("���� ���");	
	}
	public void print() {
        System.out.println("�ϴ� ���");
	}
	public void aa() {
		System.out.println("���� �ѹ�...");
		//a = 10; //interface�� �ִ� ��������� public static final
	}	
}
public class Inter02 {
	public static void main(String[] args) {
		D4 d4 = new D4();
		d4.display();
		d4.print();
		d4.aa();
	}

}
