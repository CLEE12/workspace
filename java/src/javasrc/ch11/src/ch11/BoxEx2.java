package ch11;

class Box2<T> {
	T fruit;
	public void setFruit(T fruit) {
		this.fruit = fruit;
	}
	public T getFruit() {
		return fruit;
	}
}
public class BoxEx2 {
	public static void main(String[] args) {
		Box2<Orange> bx = new Box2<>();
		bx.setFruit(new Orange(10));
		Orange or1 = (Orange)bx.getFruit();
		or1.print();
/*		
		bx.setFruit("¿À·»Áö");
		Orange or2 = (Orange)bx.getFruit();
		or2.print();
		bx.setFruit(new Apple(100));
*/	
		}
}
