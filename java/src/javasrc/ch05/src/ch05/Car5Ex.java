package ch05;

class Car5 {
	int x, y; //맴버변수의 값이 없을경우 0으로 들어간다.
	Car5() {
		System.out.println("나는 기본 생성자");
	}
	Car5(int a) {
		x = a;
		System.out.println("매개변수 1개 : "+a);
	}
	Car5(int a, int b) {
		x = a; y = b;
		System.out.println("매개변수 2개 a= "+a+", b= "+b);
	}
}
public class Car5Ex {
	public static void main(String[] args) {
		Car5 c1= new Car5(); // 숫자를 입력하면 12번 줄에 해당하는 문구를 출력 함.
		Car5 c2= new Car5(15);
		Car5 c3= new Car5(23, 56);
		System.out.println("c1.x = "+c1.x+", c1.y = "+c1.y);
		System.out.println("c2.x = "+c2.x+", c2.y = "+c2.y);
		System.out.println("c3.x = "+c3.x+", c3.y = "+c3.y);
	}
}
