package ch05;

class Bicycle1 {
	String color;
	int wheel;
	String name;
    void ride() {
		System.out.println(name+"가 "+color+"색의 바퀴가 "+wheel+"개인 자전거를 탄다.");
	}
}

public class Bicycle {
	public static void main(String[] args) {
		Bicycle1 b1 = new Bicycle1();
		Bicycle1 b2 = new Bicycle1();
		b1.name = "Ken";
		b1.color= "Green";
		b1.wheel= 3;
		b2.name = "Block";
		b2.color= "Black";
		b2.wheel= 4;
		b1.ride();
		b2.ride();
		//System.out.println(b1.name+"가 "+b1.color+"색의 바퀴가 "+b1.wheel+"개인 자전거를 탄다. ->tricycle");
		//System.out.println(b2.name+"가 "+b2.color+"색의 바퀴가 "+b2.wheel+"개인 자전거를 탄다. ->Quadcycle");
	}
}