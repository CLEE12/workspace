package ch08;

interface Car {
	void move();
}
class Bus implements Car {
	public void move() {
	    System.out.println("�°� 40���� �¿�� �̵��Ѵ�.");
	}
}
class Texi implements Car {
	public void move() {
		System.out.println("�°� 4���� �¿�� �Ѿ�ó�� �޸���.");
	}
}
class Ambulance implements Car {
	public void move() {
		System.out.println("����ȯ�ڸ� �¿�� ����.");
	}
}