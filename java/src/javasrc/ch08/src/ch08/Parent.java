package ch08;

public class Parent {
	Parent() {
		System.out.println("�� �θ� ������");
	}
	void p1() {
		System.out.println("�� �θ� �޼ҵ�");
	}
}
class Child extends Parent {
	public Child() {
		System.out.println("�� �ڽ� ������");
	}
	@Override //annotation: �ּ�, ����
	void p1() {
		System.out.print("�� �ڽ� �޼ҵ�");
	}
}