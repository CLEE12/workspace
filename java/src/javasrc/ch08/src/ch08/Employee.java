package ch08;
public class Employee {
	final double RATE = 0.1;
	String name;
	public Employee() { }
	public Employee(String name) {
		this.name = name;
	}
	// �ڽ� Ŭ�������� ������(overriding) ���
	public int calPay() {
		return 0;
	}
	//�� �޼ҵ�� ����(overriding) ����
	public final int calIncentive() {
		int result = 0;
		int pay = calPay();
		if(pay > 10000) {
			result = (int)(pay * RATE);
		}
		return result;
	}
}
