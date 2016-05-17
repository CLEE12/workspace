package ch05;
//접근지정자  예약어 클래스명
public class Car {
	//멤버변수, 필드, 전역변수
	//배열, 멤버변수 -> 숫자 0, 문자는 null, 불형은 false로 자동 초기화\
	public String name; //다른 클래스에서 쓰려면 public을 써 줘야 함.
	String color;
	public int speed; //다른 클래스에서 쓰려면 public을 써 줘야 함.
	//메소드
	public void speedUp(int speed) { //다른 클래스에서 쓰려면 public을 써 줘야 함.
   //반환형 메소드명  매개변수
		System.out.println(speed+"km의 시속으로 달린다");
	}

}
