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
		System.out.println("������ȣ : "+no);
		System.out.println("�԰� : "+inTime+", ��� : "+outTime);
		System.out.println("��� : "+fee);
	}
}

public class Car6Ex {
	public static void main(String[] args) {
		Car6 c1 = new Car6("�� 1111", 10, 13);
		Car6 c2 = new Car6("�� 1111", 11, 17);
		Car6 c3 = new Car6("�� 1111", 9, 12);
		c1.print();
		c2.print();
		c3.print();
		
	}
}