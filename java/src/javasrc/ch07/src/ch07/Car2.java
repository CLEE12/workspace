package ch07;
public class Car2 {
	int k = 7;
	void move() {
		System.out.println("�ڵ����� �����δ�.");
	}
}
class Ambulance extends Car2 {
	int k = 22;
	void move() {
		System.out.println("���̷��� �︮�鼭 �޸���.");
	}
	void siren() {
		System.out.println("�߻� �߻� �Ҹ��� ����.");
	}
}
class FireEngine extends Car2 {
	void move() {
		System.out.println("�汤���� �Ѱ� �޸���.");
	}
	void ride() {
		System.out.println("�ҹ����� ���� ź��.");
	}
}