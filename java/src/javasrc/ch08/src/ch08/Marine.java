package ch08;
abstract class Unit {
	abstract void move();
	void stop() {
		System.out.println("������ �����");
	}
}

public class Marine extends Unit {
	void move() {
		System.out.println("go go go");
	}
}
class Tank extends Unit {
	void move() {
		System.out.println("�������� �̵��Ѵ�");
	}
}
class Dropship extends Unit {
	void move() {
		System.out.println("����ǰ�� �ư� �̵��Ѵ�.");
	}
}
