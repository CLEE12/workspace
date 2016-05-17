package ch06;
class B1 {
	void add(int x, int y) { //메소드 안에 정의된건 지역변수
		x += y; 
		y += 2;
		System.out.println("연산결과");
		System.out.println("x = "+x);
		System.out.println("y = "+y);
	}
}
public class CallValue {
	public static void main(String[] args) {
		B1 b = new B1();
		int x = 10;
		int y = 8;
		b.add(x, y); // call by value
		System.out.println("메인데이터");
		System.out.println("x = "+x);
		System.out.println("y = "+y);
	}

}
