package ch02;

public class LogicalOp {
	public static void main(String[] args) {
		
		boolean b1 = true, b2 =false;
		System.out.println("b1 && b2 = "+(b1&&b2));
		//and(&&)연산자는 둘다 true여야 결과가 true.
		
		System.out.println("b1 || b2 = "+(b1||b2));
		//or(||)연산자는 둘중 하나만 true면 결과가 true.
		
		boolean b3 = 3 < 5 || 7 > 6;
		System.out.println("b3 = "+b3);
		
		boolean b4 = 3 < 5 && 7 <= 6;
		System.out.println("b4 = "+b4);
		
	}

}
