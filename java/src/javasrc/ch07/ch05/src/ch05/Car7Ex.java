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
		System.out.println("���� : "+name);
		System.out.println("���� : "+color);
		System.out.println("���� : "+door);
		System.out.println("----------");
	}
}
public class Car7Ex {
	public static void main(String[] args) {
	Car7 c1 = new Car7();
	c1.name = "�ҳ�Ÿ"; c1.color = "��ũ"; c1.door = 5;
	Car7 c2 = new Car7("���","�ʷ�",4);
	c1.print();
	c2.print();
	}
}
