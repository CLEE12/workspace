package ch02;

public class BitOp {
	public static void main(String[] args) {
		int i1 = 10, i2 = 6;
		System.out.println("i1 & i2 = "+(i1&i2));
		System.out.println("i1 | i2 = "+(i1|i2));
		System.out.println("i1 ^ i2 = "+(i1^i2)); //xor은 서로 다른것만 1로 본다.
		System.out.println("~i1 = "+(~i1));
				
	}

}
