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
			throw new Exception("에러! 야호");
			
	/*	} catch (Exception e) {
			System.out.println(e.getMessage()); //내가 throw를 처리하는 방법.
		}*/
	}

}
