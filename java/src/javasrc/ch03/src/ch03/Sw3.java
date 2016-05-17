package ch03;
public class Sw3 {
	public static void main(String[] args) {
		
		int score = Integer.parseInt(args[0]);
		int etc   = score % 10;
		String grade = "";
		switch(score/10) {
		case 10 : 
		case 9 : grade = "A"; break;
		case 8 : grade = "B"; break;
		case 7 : grade = "C"; break;
		case 6 : grade = "D"; break;
		default : grade = "F"; break;
		}
		if (score < 100 && score >= 60) {
			  if (etc > 7) grade +="+";
		       else if (etc < 4) grade +="-";
		       else grade += "0";
		}
		System.out.println("당신의 학점 : "+grade);
	}

}