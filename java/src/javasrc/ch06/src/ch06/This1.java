package ch06;
class F1 {
	int a;
	F1() {
		System.out.println("매개변수 없다");
	}
	F1(int a) {
		this(); //매개변수가 blank이기 때문에 없다. //this()는 각 생성자(F1)의 맨 처음에 있어야 한다.
		this.a=a;
		System.out.println("매개변수 a = "+a);
	}
	F1(int a, int b) {
		this(a); //매개변수가 1개인 다른 생성자 호출
		System.out.println("매개변수 2 a = "+a+",b = "+b);
	}
}

public class This1 {
	public static void main(String[] args) {
		F1 f1 = new F1(45,3);
		System.out.println("a = "+f1.a);
	}
}
