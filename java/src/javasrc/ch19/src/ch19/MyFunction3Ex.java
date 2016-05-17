package ch19;

interface MyFunction3Inter {
	int aa(int x, int y);	
}

public class MyFunction3Ex {
	public static void main(String[] args) {
		MyFunction3Inter mi = (x,y) -> {return x+y;};
		System.out.println("합계 : "+mi.aa(7, 15));
		
		MyFunction3Inter mi2 = (x,y) -> x+y;
		System.out.println("합계 : "+mi2.aa(77, 72));
	}

}
