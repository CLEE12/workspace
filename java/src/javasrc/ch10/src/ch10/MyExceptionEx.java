package ch10;

public class MyExceptionEx {
	public static void main(String[] args) {
		try {
			throw new MyException("��� ����");
		 
		}
		catch (MyException e) {
			System.out.println(e.getMessage());
		}
		try {
			throw new TwoException();
		}
		catch (TwoException e) {
			e.print();
		}
	}
}
//exception�� ��ӹ����� �װ� ����ã�� ���α׷��̴�.