package ch06;

class Cal2 {
	int x1, y1;
	String sub;
	Cal2(int a, int b) {
		x1 = a;
		y1 = b;	
	}
	void m1() {
		System.out.println(sub);
		System.out.printf("|\t%d + %d = %d\t|\n",x1,y1,x1+y1);
		System.out.printf("|\t%d - %d = %d\t|\n",x1,y1,x1-y1);
	}
	void m2() {
		if(y1 != 0) {
		System.out.printf("|\t%d x %d = %d\t|\n",x1,y1,x1*y1); 
		System.out.printf("|\t%d / %d = %d\t|\n",x1,y1,x1/y1); 
	}
		else System.out.println("| 0으로 곱하거나 나눌 수 없습니다.|");
		System.out.println("=========================\n");

}
}
public class Cal2Ex {
	public static void main(String[] args) {
		Cal2 c1 = new Cal2(12,2);
		Cal2 c2 = new Cal2(34,3);
		Cal2 c3 = new Cal2(7,0);
		Cal2 c4 = new Cal2(65,3);
		c1.sub = "c1-----------------------";
		c2.sub = "c2-----------------------";
		c3.sub = "c3-----------------------";
		c4.sub = "c4-----------------------";
		c1.m1();
		c1.m2();
		c2.m1();
		c2.m2();
		c3.m1();
		c3.m2();
		c4.m1();
		c4.m2();
	}
}