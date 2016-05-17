package ch05;

class Car7 {
	String name;
	String color;
	int door;
	Car7(){}
	Car7(String n, String c, int d) {
		name = n; color = c; door = d;
	}
	void print() {
		System.out.println("차종 : "+name);
		System.out.println("색상 : "+color);
		System.out.println("문수 : "+door);
		System.out.println("----------");
	}
}
public class Car7Ex {
	public static void main(String[] args) {
	Car7 c1 = new Car7();
	c1.name = "소나타"; c1.color = "핑크"; c1.door = 5;
	Car7 c2 = new Car7("모닝","초록",4);
	c1.print();
	c2.print();
	}
}
