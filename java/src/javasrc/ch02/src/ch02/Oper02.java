package ch02;

public class Oper02 {
	public static void main(String[] args) {
		int a1 = 5, a2 = 5;
		int b1 = --a1, b2 = a2--;
		//a1이 4가 되고, b1에 대입.
		//a2fmf b2에 대입하고, a2에서 1 감소.
		
		System.out.println("a1 = "+a1+", b1 = "+b1);
		System.out.println("a2 = "+a2+", b2 = "+b2);

	}

}
