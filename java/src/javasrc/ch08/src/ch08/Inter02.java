package ch08;
interface D1 { //실질적으로 interface는 빈 껍데기.
	int a = 7; // <--final
	void display();

}
interface D2 {
	void print();

}
interface D3 extends D1, D2 { //interface끼리는 extends로  다중상속 가능.
	void aa();
	
}
class D4 implements D3 { //class에서 interface를 상속받을땐 implements.
	public void display() {
		System.out.println("설현 대박");	
	}
	public void print() {
        System.out.println("하니 사건");
	}
	public void aa() {
		System.out.println("수지 한물...");
		//a = 10; //interface에 있는 멤버변수는 public static final
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
