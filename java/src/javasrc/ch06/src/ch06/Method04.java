package ch06;

public class Method04 {
	static int add(int x, int y) {
		return x+y;
	}
	static double square(double x) {
		return x*x;
	}
	public static void main(String[] args) {
		Method04 m = new Method04();
		System.out.println(Method04.add(10,12)); //static을 입력하면 Method04를 입력해서 가능.
		System.out.println(square(2.5)); // 없이도 가능. (이름이 같으면 생략 가능)
		/*
		System.out.println(m.add(10,12)); // static을 입력하지 않으면 m.add 이렇게 입력해줘야 함.
		System.out.println(m.square(2.5));
	    */
	}

}
