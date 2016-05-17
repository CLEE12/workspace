package ch06;

class A2 {
	void aa(){
		System.out.println("대박");
	}
	void bb(){
		System.out.println("사건");
	}
}
public class Method02 {
	public static void main(String[] args) {
		A2 a2 = new A2();
		a2.aa();
		a2.bb();
	}
}
