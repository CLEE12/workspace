package ch08;
interface E1 {
	void e1();
}
interface E2 {
	void e2();
}
class E3 implements E1, E2 { //인터페이스는 복수로 상속구현이 가능
    public void e2() {
	    System.out.println("월요일");
}
public void e1() {
		System.out.println("어쩌라구");
	}
}
public class Inter03 {
	public static void main(String[] args) {
		E3 e2 = new E3();
		e2.e1();
		e2.e2();
		e2.e1();
	}
}