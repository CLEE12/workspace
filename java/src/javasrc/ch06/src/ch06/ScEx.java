package ch06;
public class ScEx {
	public static void main(String[] args) {
		String[] title = {"이름","국어","영어","수학","과학","총점","평균"};
		int[][] score={{90,80,70,87},{76,86,90,98},{90,78,90,56},
				{80,80,80,87},{85,98,88,78}};
		String[] name = {"아이유","배수지","효린","이승기","현빈"};
		String subject = "성적표";
		int cnt = 52;
		ScoreCal sc = 
			new ScoreCal(subject, title, score, name, cnt);
		sc.print();				
	}
}