package ch19;

public class MyFunctionEx {
	public static void main(String[] args) {
		MyFunctionInterface mi = new MyFunctionInterface() {
			public void method() { //인터페이스에 있는 정의는 반드시 재 정의해서 사용해야 한다.
				System.out.println("대박");
			}
		};
		mi.method();
		
		MyFunctionInterface mi2 = new MyFunctionCl();
		mi2.method();
		
		MyFunctionInterface mi3 = ()-> {System.out.println("허걱");};
		mi3.method();
		
		MyFunctionInterface mi4 = ()-> System.out.println("허각");
		mi4.method();
	}
}
