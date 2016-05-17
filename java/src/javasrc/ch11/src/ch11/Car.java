package ch11;

public abstract class Car {
	abstract void print();
}
class Bus extends Car {
	void print() {
		System.out.println("난 버스야");
	}
	void move() {
		System.out.println("난 40명 승객을 태우고 이동해");
	}
}
class Taxi extends Car {
	void print() {
		System.out.println("난 핑크 택시야");
	}
}
class Ambulance {
	void print() {
		System.out.println("난 응급차야");
	}
}
