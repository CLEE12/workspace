package ch05;

class Car4 {
	String name, color;
	static int cnt;
	Car4(String n, String c) {
		name = n;	color = c; cnt++;
	}
	void print() {
		System.out.println("����: "+name+", \t����: "+color);
	}
}
public class Car4Ex {
	public static void main(String[] args) {
		Car4 c1 = new Car4("Audi", "Red");
		Car4 c2 = new Car4("BMW", "Yellow");
		Car4 c3 = new Car4("Benz", "Green");
		Car4 c4 = new Car4("Cadilac", "Pink");
		c1.print();
		c2.print();
		c3.print();
		c4.print();
		System.out.println("ù ������ ���: "+Car4.cnt);
	}
}