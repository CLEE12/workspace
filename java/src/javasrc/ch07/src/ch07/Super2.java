package ch07;
class F1 {
	int a;
	F1() {
		System.out.println("�Ű����� ���� �θ�");
	}
	F1(int a) {
		this();
		this.a = a;
		System.out.println("�θ������ : "+a);
	}
}
class F2 extends F1 {
	F2(int a) {
		super(a);
		System.out.println("�ڽ� ������ : "+a);
	}
	void display() {
		System.out.println("�ڽ� �޼ҵ� : "+a);
	}
}
public class Super2 {
	public static void main(String[] args) {
		F2 f2 = new F2(23);
		f2.display();
	}

}
