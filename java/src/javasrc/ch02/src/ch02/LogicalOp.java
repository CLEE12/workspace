package ch02;

public class LogicalOp {
	public static void main(String[] args) {
		
		boolean b1 = true, b2 =false;
		System.out.println("b1 && b2 = "+(b1&&b2));
		//and(&&)�����ڴ� �Ѵ� true���� ����� true.
		
		System.out.println("b1 || b2 = "+(b1||b2));
		//or(||)�����ڴ� ���� �ϳ��� true�� ����� true.
		
		boolean b3 = 3 < 5 || 7 > 6;
		System.out.println("b3 = "+b3);
		
		boolean b4 = 3 < 5 && 7 <= 6;
		System.out.println("b4 = "+b4);
		
	}

}
