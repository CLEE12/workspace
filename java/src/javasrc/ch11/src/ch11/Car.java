package ch11;

public abstract class Car {
	abstract void print();
}
class Bus extends Car {
	void print() {
		System.out.println("�� ������");
	}
	void move() {
		System.out.println("�� 40�� �°��� �¿�� �̵���");
	}
}
class Taxi extends Car {
	void print() {
		System.out.println("�� ��ũ �ýþ�");
	}
}
class Ambulance {
	void print() {
		System.out.println("�� ��������");
	}
}
