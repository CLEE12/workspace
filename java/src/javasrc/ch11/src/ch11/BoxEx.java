package ch11;

class Box1 {
	Object fruit;
	public void setFruit(Object fruit) {
		this.fruit = fruit;
	}
	public Object getFruit() {
		return fruit;
	}
}
public class BoxEx {
	public static void main(String[] args) {
		Box1 bx = new Box1();
		bx.setFruit(new Orange(10));
		Orange or1 = (Orange)bx.getFruit();
		or1.print();
		bx.setFruit("¿À·»Áö");
		
		Orange or2 = (Orange)bx.getFruit();
		or2.print();
		bx.setFruit(new Apple(100));
	}
}
