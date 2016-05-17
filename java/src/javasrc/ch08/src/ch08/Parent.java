package ch08;

public class Parent {
	Parent() {
		System.out.println("난 부모 생성자");
	}
	void p1() {
		System.out.println("난 부모 메소드");
	}
}
class Child extends Parent {
	public Child() {
		System.out.println("난 자식 생성자");
	}
	@Override //annotation: 주석, 설명
	void p1() {
		System.out.print("난 자식 메소드");
	}
}