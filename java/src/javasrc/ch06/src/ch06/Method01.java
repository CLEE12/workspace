package ch06;

class A1 {
	public void print() {
//접근지정자   반환형  메소드명(){
		System.out.println("안녕"); // <-- 실행문
	}

}

public class Method01 {
	public static void main(String[] args) {
		System.out.println("Hi!");
		System.out.println("Hi!");
		System.out.println("Hi!");
		System.out.println("Hi!");
		System.out.println("Hi!");
		System.out.println("Hi!");
		System.out.println("Hi!");
		System.out.println("Hi!");
		System.out.println("Hi!");
		
		A1 a1 = new A1();
		for (int i=0; i<10; i++) {
			a1.print();
		}
	}
}