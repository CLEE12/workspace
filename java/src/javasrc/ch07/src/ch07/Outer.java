package ch07;
public class Outer {
	int height, width;
	Outer(int height, int width) {
		this.height = height;
		this.width  = width;
	}
	public Inner getInner() {
		return new Inner();
	}
	class Inner { //class ¾È¿¡ class.
		int depth = 10;
		int volume() {
			return height * width * depth;
		}
	}
}