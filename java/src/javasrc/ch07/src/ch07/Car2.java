package ch07;
public class Car2 {
	int k = 7;
	void move() {
		System.out.println("자동차는 움직인다.");
	}
}
class Ambulance extends Car2 {
	int k = 22;
	void move() {
		System.out.println("싸이렌을 울리면서 달린다.");
	}
	void siren() {
		System.out.println("삐뽀 삐뽀 소리가 난다.");
	}
}
class FireEngine extends Car2 {
	void move() {
		System.out.println("경광등을 켜고 달린다.");
	}
	void ride() {
		System.out.println("소방대원이 차고 탄다.");
	}
}