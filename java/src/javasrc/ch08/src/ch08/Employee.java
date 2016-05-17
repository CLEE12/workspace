package ch08;
public class Employee {
	final double RATE = 0.1;
	String name;
	public Employee() { }
	public Employee(String name) {
		this.name = name;
	}
	// 자식 클래스에서 재정의(overriding) 사용
	public int calPay() {
		return 0;
	}
	//이 메소드는 변경(overriding) 금지
	public final int calIncentive() {
		int result = 0;
		int pay = calPay();
		if(pay > 10000) {
			result = (int)(pay * RATE);
		}
		return result;
	}
}
