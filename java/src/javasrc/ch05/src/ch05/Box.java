package ch05;
class BoxDi {
	int width, height, depth; //멤버속성변수
	String object=""; 
	Car myCar; //멤버참조변수
	//메소드: 반환형 메소드명() {실행문;}
	void print() {
		int volume = width * height * depth;
		System.out.println(object+"의 부피는 "+volume+"입니다.");
	}
}

public class Box{ //main이 들어가는 클래스명이랑 같아야 한다.
	public static void main(String[] args) {
		BoxDi d1 = new BoxDi();
		BoxDi d2 = new BoxDi();
		d1.width = 15;
		d1.height= 20;
		d1.depth = 10;
		d2.width =  7;
		d2.height= 12;
		d2.depth =	5;
		d1.object="A";
		d2.object="B";
		d1.print();
		d2.print();
	}
}
