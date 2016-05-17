package ch06;
class Car {
	String team, name;
	int award;
	Car(String team, String name, int award) {
		this.team = team; this.name = name; this.award = award; // 클래스 안에 있는 멤버 변수것이란 뜻 : this
	}
	void print() {
		System.out.println("Team: "+team+"\nName: "+name+"\nWin : "+award);
		System.out.println("=====================");
	}
}
public class CarEx {
	public static void main(String[] args) {
		Car c1 = new Car("Red Bull", "Daniel Riccardo", 10);
		Car c2 = new Car("Monster", "Ken Block", 12);
		c1.print();
		c2.print();
		System.out.println("       //===--===\\");
		System.out.println("  ____//____||___|\\");
		System.out.println("/   ____      ____ \\");
		System.out.println("0__//--\\_____//--\\_0");
		System.out.println("    \\--/      \\--/");
	}
}
/*
            /----------\
       ____//____||____\\
      /   ____     ____  \
      0__//--\\___//--\\_0
          \--/     \--/
*/