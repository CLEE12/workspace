package ch10;

public class MyExceptionEx {
	public static void main(String[] args) {
		try {
			throw new MyException("대박 에러");
		 
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
//exception을 상속받으면 그게 에러찾는 프로그램이다.