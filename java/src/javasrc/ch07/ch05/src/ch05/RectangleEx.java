package ch05;
class Rectangle {
	int width = 10, height = 10; //전역변수
	String name;
	Rectangle(){}
    Rectangle(int a) {
    	width = a;
    }
    Rectangle(int a, int b) {
    	width = a; height = b;
    	
    }
    void print() { //지역변수
    System.out.println(name+"의 면적 :"+(width*height));
    System.out.println(name+"의 길이 :"+(2*(width+height)));
    }
}
public class RectangleEx {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(15);
		Rectangle r3 = new Rectangle(15, 20);
		r1.name ="R1";
		r2.name ="R2";
	    r3.name ="R3";		
		r1.print();
		r2.print();
		r3.print();
	}
}
