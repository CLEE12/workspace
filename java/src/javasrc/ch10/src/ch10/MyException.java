package ch10;
public class MyException extends Exception{
	public MyException() {	}
	public MyException(String msg) {
		super(msg);
	}
}

class TwoException extends Exception {
	public TwoException() {
	}
	void print() {
		System.out.println("�� ! ��������");
	}
}