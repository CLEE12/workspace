package ch05;
public class Calc {
	int square;
	int rectangle;
	int volume;
	Calc(int s) {  //������(��������) ������ ������ ������ �ȵȴ�. ex) Calc(int c)�� �߰��� �� ����.
		square = s*s;
	}
	Calc(int a, int b) {
		rectangle = a*b;
	}
	Calc(int w, int h, int d) {
		volume = w*h*d;
	}
public static void main(String[] args) {
	Calc c1 = new Calc(15);
	System.out.println("square of square c1 : "+c1.square);
	Calc c2 = new Calc(15,20);
	System.out.println("square of retangle c2 : "+c2.rectangle);
	Calc c3 = new Calc(15, 20, 10);
	System.out.println("cube of retangle c3 : "+c3.volume);
}
}
