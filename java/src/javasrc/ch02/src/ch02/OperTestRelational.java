package ch02;

public class OperTestRelational {
	public static void main(String[] args) {
		byte a =20;
		double d = 3.14;
		boolean fag;
		
		fag = a > d;
		System.out.println("a가 d보다 큰가? "+fag);
		
		fag = a == 20.0f; //왜 20.0f냐?
		System.out.println("a가 20.0f와 같은가? "+fag);
		
		fag = 10 != 10;
		System.out.println("10이 10과 같지 않은가? "+fag);
		
		fag = 10 <= 20;
		System.out.println("10이 20보다 작거나 같은가? "+fag);
		
	}

}
