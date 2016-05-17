package ch06;

class Calc {
	int x, y;
	Calc(int a, int b){
		x = a; y = b;
	}
	void print() {
		System.out.printf("%d + %d = %d\n",x,y,x+y);
		System.out.printf("%d - %d = %d\n",x,y,x-y);
	}

}

public class CalEx {
	public static void main(String[] args) {
		Calc c1 = new Calc(11,7);
		Calc c2 = new Calc(45,23);
		c1.print(); 
		c2.print();
		
	}
}
