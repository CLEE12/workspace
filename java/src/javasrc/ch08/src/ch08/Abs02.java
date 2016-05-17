package ch08;
abstract class B1 {
	int a1;
	void setA1(int a1) {
		this.a1=a1;
	}// overridinge의 경우 매개변수가 부모와 같아야 함.
	public abstract void cal(); /* {
		System.out.println("a1의 제곱 : "+a1*a1);
	}*/ //abstract를 쓰면서 삭제
}
class B2 extends B1 {
	public void cal() { //부모가 public이면 자식은 최소한 크거나 같아야 한다.
		System.out.println("a1의 제곱 : "+a1*a1);
	}
}
public class Abs02 {
	public static void main(String[] args) {
		B1 b1 = new B2();
		b1.setA1(7);
		b1.cal();
	}

}
