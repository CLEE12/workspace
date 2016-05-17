package ch07;
public class Car3 {
	String name;
	String kind;
	Car3(String name, String kind) {
		this.name=name;
		this.kind=kind;
	}
	void move() {
		System.out.println(name+"이 "+kind+"를 태우고 달린다.");
	}
}
class Bus extends Car3 {
	int num;
	Bus(String name, String kind, int num) {
		super(name, kind);
		this.num =num;
	}
	void move() {
		System.out.println(name+"이 "+kind+"를 "+num+"명 태우고 달린다.");
	}
}
class Taxi extends Car3 {
	int speed;
	Taxi(String name, String kind, int speed) {
		super(name,kind);
		this.speed=speed;
	}
	void move() {
		System.out.println(name+"이 "+kind+"를 "+speed+" 속도로 달린다.");
	}
}
class Ambulance2 extends Car3 {
	String sound;
	Ambulance2(String name, String kind, String sound) {
		super(name, kind); this.sound=sound;
	}
	void siren() {
		System.out.println(name+"의"+kind+"가"+sound+"소리를 내고 달린다.");
	}
	
}


