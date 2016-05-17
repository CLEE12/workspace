package ch04;

public class TwoArr03 {
	public static void main(String[] args) {
		int[][] amt = {{23,54,67},{54,89,},{12,34,12,76}};
		for(int i=0; i<amt.length; i++) {
			for(int j=0; j<amt[i].length; j++) {
				System.out.print(amt[i][j]+"\t");
			}
			System.out.println("¿­°³¼ö "+amt[i].length);
		}
	}

}
