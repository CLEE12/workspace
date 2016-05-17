package ch07;
class F1 {
	int a;
	F1() {
		System.out.println("매개변수 없는 부모");
	}
	F1(int a) {
		this();
		this.a = a;
		System.out.println("부모생성자 : "+a);
	}
}
class F2 extends F1 {
	F2(int a) {
		super(a);
		System.out.println("자식 생성자 : "+a);
	}
	void display() {
		System.out.println("자식 메소드 : "+a);
	}
}
public class Super2 {
	public static void main(String[] args) {
		F2 f2 = new F2(23);
		f2.display();
	}

}
