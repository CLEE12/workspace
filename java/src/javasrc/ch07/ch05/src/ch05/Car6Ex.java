package ch05;
class Car6 {
	String no; 
	int inTime;
	int outTime; 
	int fee;
	
	Car6(String n, int in, int out) {
		no = n; inTime = in; outTime = out;
	}
	
	void print() {
		fee = (outTime-inTime) * 2000;
		System.out.println("차량번호 : "+no);
		System.out.println("입고 : "+inTime+", 출고 : "+outTime);
		System.out.println("요금 : "+fee);
	}
}

public class Car6Ex {
	public static void main(String[] args) {
		Car6 c1 = new Car6("가 1111", 10, 13);
		Car6 c2 = new Car6("나 1111", 11, 17);
		Car6 c3 = new Car6("다 1111", 9, 12);
		c1.print();
		c2.print();
		c3.print();
		
	}
}