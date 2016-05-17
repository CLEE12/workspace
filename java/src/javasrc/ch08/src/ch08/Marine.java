package ch08;
abstract class Unit {
	abstract void move();
	void stop() {
		System.out.println("진행을 멈춘다");
	}
}

public class Marine extends Unit {
	void move() {
		System.out.println("go go go");
	}
}
class Tank extends Unit {
	void move() {
		System.out.println("육지에서 이동한다");
	}
}
class Dropship extends Unit {
	void move() {
		System.out.println("보급품을 싣고 이동한다.");
	}
}
