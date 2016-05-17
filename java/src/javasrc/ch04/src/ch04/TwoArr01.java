package ch04;

public class TwoArr01 {
	public static void main(String[] args) {
		int[][] amt = new int[2][3]; //amt[행][열]의 정적 배열, [행][ ]은 동적 배열.
		amt[0][0] = 76; amt[0][1] = 45; amt[0][2] = 32;
		amt[1][0] = 12; amt[1][1] = 56; amt[1][2] = 98;
		//type 1
		for(int i=0; i<amt.length; i++) {
			for(int j=0; j<amt[i].length; j++) {
				System.out.println("amt["+i+"]["+j+"] = "+amt[i][j]);
			}
		}
		//type 2
		System.out.println("===============");
		for(int[] i : amt) {
			for(int j : i) {
				System.out.println(j);
			}
		}
	}

}
