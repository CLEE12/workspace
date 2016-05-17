package ch04;

public class TestTwoArr3 {
	public static void main(String[] args) {
		int[] change = {500,100,50,10};
		int charge = 2680;
		for(int i=0; i<change.length; i++) {
			System.out.println(change[i]+"¿ø : "+charge/change[i]+"°³");
			charge %= change[i];
		}
	}

}
