package ch10;

public class Throws22 {
	public static void main(String[] args) /*throws Exception*/  {
		try {
			method1();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	static void method1() throws Exception {
		//try {
			method2();
		/*}catch (Exception e) {
			System.out.println(e.getMessage());	
	}*/
	}
	static void method2() throws Exception {
		//try {
			throw new Exception("����! ��ȣ");
			
	/*	} catch (Exception e) {
			System.out.println(e.getMessage()); //���� throw�� ó���ϴ� ���.
		}*/
	}

}
