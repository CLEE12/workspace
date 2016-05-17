package ch03;
public class Sw4 {
	public static void main(String[] args) {
		
		int score = Integer.parseInt(args[0]);
		int etc   = score % 10; // 1의 자리수를 평가하기 위함. 10으로 나눠서 나오는 나머지.
		String grade = "";
		
		switch(score/10) {
		case 10 : 
		case 9 : grade = "A"; break;
		case 8 : grade = "B"; break;
		case 7 : grade = "C"; break;
		case 6 : grade = "D"; break;
		default : grade = "F"; break;
		}
		
		if (score < 100 && score >= 60) 
		{switch(etc) 
		 {  case 9 : 
			case 8 : grade += "+"; break;
			case 0 : 
			case 1 : 
			case 2 :
			case 3 : grade += "-"; break;
		    default : grade += "0";
		 }
		}
	
		System.out.println("너의 학점 : "+grade);
	
	}
}