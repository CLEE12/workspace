package ch07;
class E1 {
	//생성자가 1개라도 있으면 default 생성자가 안만들어진다.
	//E1() { System.out.println("매개변수 없는 부모"); }
	E1(int a) { System.out.println("난 매개변수 1개 부모 : "+a); }
}
class E2 extends E1 {
	E2() { 
		super(7); //매개변수 7을 가진 부모생성자를 생성한다
		System.out.println("매개변수 없는 생성자");	}
	
	E2(int b) {	
		super(b);
		System.out.println("매개변수 1개 : "+b); }
}
public class Super1 {
	public static void main(String[] args) {
		//E2 e1 = new E2();
		E2 e2 = new E2(15);
	}

}
