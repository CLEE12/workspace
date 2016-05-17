package ch04;

public class TwoArr02 {
	public static void main(String[] args) {
		int[][] score = {{67, 78, 89},{54,87,98}};
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length;j++) {
				System.out.print(score[i][j]+"\t");
			}
			    System.out.println();
		    }
	        	System.out.println("==================");
		for(int[] s : score) {
			for(int j : s)   {
				System.out.print(j+"\t");
			}
				System.out.println();
			}
		}
}