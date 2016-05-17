package ch04;

public class Score1 {
	public static void main(String[] args) {
		int sum = 0;
		String[] title = {"이름","국어","영어","수학","총점","평균"};
		int[][] score = {{90,80,70},{76,86,90},{90,78,90},{80,80,80}};
		String[] name = {"아이유","배수지","효린","이승기"};
		
		
		System.out.println("성적표\n");
		
		
		for(String tit : title) {
			System.out.print(tit+"\t");
		}
		
		
		System.out.println();
		
		
		for(int i=0; i<43; i++) {
			System.out.print("=");
		}
		
		
		System.out.println();
		
		
		for(int i=0; i<score.length; i++) {
			System.out.print(name[i]+"\t");
			for(int j=0; j<score[i].length; j++) {
				
				System.out.print(score[i][j]+"\t");
				sum += score[i][j];
			}	
			System.out.println(sum+"\t"+sum/score[i].length);
			sum = 0;
		}
		for(int i=0; i<43; i++) {
		System.out.print("=");
    	}
	
    }		
	}