package ch08;
/**
 * 작성자 : 나야나
 * 작성일 : 오늘
 * 목적 : 그냥 심심해서
 */
/*
 * 대박사건
 */

abstract class A1 { //하나라도 추상 메소드가 있는 클래스는 추상 클래스
	void print () { //일반 메소드
		System.out.println("야호 월요일!");
	}
	abstract void display();  //추상 메소드
}
class A2 extends A1 {
	void display() {
		System.out.println("춥다! 영하 14도");
	}	
}
public class Abs01 {
	public static void main(String[] args) {
		A1 a1 = new A2(); //추상 클래스는 생성할 수 없다.
		A2 a2 = new A2(); 
	}

}
