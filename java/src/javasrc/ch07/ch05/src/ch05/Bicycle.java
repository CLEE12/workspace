package ch05;

class Bicycle1 {
	String color;
	int wheel;
	String name;
    void ride() {
		System.out.println(name+"�� "+color+"���� ������ "+wheel+"���� �����Ÿ� ź��.");
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
		//System.out.println(b1.name+"�� "+b1.color+"���� ������ "+b1.wheel+"���� �����Ÿ� ź��. ->tricycle");
		//System.out.println(b2.name+"�� "+b2.color+"���� ������ "+b2.wheel+"���� �����Ÿ� ź��. ->Quadcycle");
	}
}