package ch08;

interface Car {
	void move();
}
class Bus implements Car {
	public void move() {
	    System.out.println("승객 40명을 태우고 이동한다.");
	}
}
class Texi implements Car {
	public void move() {
		System.out.println("승객 4명을 태우고 총알처럼 달린다.");
	}
}
class Ambulance implements Car {
	public void move() {
		System.out.println("응급환자를 태우고 간다.");
	}
}