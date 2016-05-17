package ch08;

public abstract class Shape {
	abstract void draw(); //abstract ������ ���๮�� ��� �ȴ�.
	abstract void calArea();
}
class Triangle extends Shape {
	void draw() {
		System.out.println("�ﰢ���� �׸���");
	}
	void calArea() {
		System.out.println("����*����/2�� ���");
	}
}
class Circle extends Shape {
	void draw() {
		System.out.println("���� �׸���");
	}
	void calArea() {
		System.out.println("Pi * r * r");
	}
}
class Rectangle extends Shape {
	void draw() {
		System.out.println("�簢���� �׸���");
	}
	void calArea() {
		System.out.println("����*����");
	}
}