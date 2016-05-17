package ch09;

public class MathEx {
	public static void main(String[] args) {
		double d1 = 4.1, d2 = 4.7, d3 = -4.1, d4 = -4.7;
		System.out.println("round = "+Math.round(d1)); //round 는 반올림.
		System.out.println("round = "+Math.round(d2));
		System.out.println("round = "+Math.round(d3));
		System.out.println("round = "+Math.round(d4));
		System.out.println("=============");
		System.out.println("ceil = "+Math.ceil(d1));   //ceil은 올림.
		System.out.println("ceil = "+Math.ceil(d2));
		System.out.println("ceil = "+Math.ceil(d3));
		System.out.println("ceil = "+Math.ceil(d4));
		System.out.println("============="); 
		System.out.println("floor = "+Math.floor(d1)); //floor는 내림.
		System.out.println("floor = "+Math.floor(d2));
		System.out.println("floor = "+Math.floor(d3));
		System.out.println("floor = "+Math.floor(d4));
		System.out.println("=============");
	}

}
