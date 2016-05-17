package ch05;

public class Car3 {
	String name; //static이 없는 변수는 instance변수
	static String color; //클래스 변수
	//static 공유한다는 의미, 공유
	
	void print() {
		System.out.println("차종 : "+name);
		System.out.println("색깔 : "+color);
	}

}
