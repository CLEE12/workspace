package ch05;

class Shape {
	final int TRIANGLE  = 1;
	final int RECTANGLE = 2;
	final int CIRCLE    = 3;
	Shape() {} //default 생성자, 없으면 자동으로 만들어 줌/
	//생성자는 class이름과 같다 생성자는 리턴값이 없다.
	
	//return 형
	void draw(int a) {
		if(a==1) System.out.println("삼각형을 그린다.");
		else if(a==2) System.out.println("사각형을 그린다.");
		else if(a==3) System.out.println("원을 그린다.");
		else System.out.println("부모님 안부를 여쭙는다.");
	}
}

public class ShapeEx {
	public static void main(String[] args) {
		Shape sh = new Shape();
		for(int i=1; i<=3; i++) {
			sh.draw(i);
		}
	}
}
