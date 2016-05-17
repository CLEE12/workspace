package ch08;

public abstract class Shape {
	abstract void draw(); //abstract 때문에 실행문이 없어도 된다.
	abstract void calArea();
}
class Triangle extends Shape {
	void draw() {
		System.out.println("삼각형을 그리다");
	}
	void calArea() {
		System.out.println("가로*세로/2로 계산");
	}
}
class Circle extends Shape {
	void draw() {
		System.out.println("원을 그리다");
	}
	void calArea() {
		System.out.println("Pi * r * r");
	}
}
class Rectangle extends Shape {
	void draw() {
		System.out.println("사각형을 그리다");
	}
	void calArea() {
		System.out.println("가로*세로");
	}
}