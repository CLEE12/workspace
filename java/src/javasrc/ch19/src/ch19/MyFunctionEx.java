package ch19;

public class MyFunctionEx {
	public static void main(String[] args) {
		MyFunctionInterface mi = new MyFunctionInterface() {
			public void method() { //�������̽��� �ִ� ���Ǵ� �ݵ�� �� �����ؼ� ����ؾ� �Ѵ�.
				System.out.println("���");
			}
		};
		mi.method();
		
		MyFunctionInterface mi2 = new MyFunctionCl();
		mi2.method();
		
		MyFunctionInterface mi3 = ()-> {System.out.println("���");};
		mi3.method();
		
		MyFunctionInterface mi4 = ()-> System.out.println("�㰢");
		mi4.method();
	}
}
