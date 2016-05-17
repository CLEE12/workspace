package ch03;

public class If7 {
	public static void main(String[] args) {
		int score = Integer.parseInt(args[0]);
	    int etc   = score%10;
		String grade = "";
	
		if (score >= 90) {grade = "A";}
	    else if (score >= 80) {grade = "B";}
        else if (score >= 70) {grade = "C";}
        else if (score >= 60) {grade = "D";}
        else grade = "폭망ㅗㅗ";
	    
	    if (score >= 100) grade ="A+";
	    else if (score >= 60) { //60이상만 등급이 나오게 되어있어서 60.
	    	 if (etc > 7) grade +="+";
	    	 else if (etc < 4) grade +="-";
	    	 else grade += "0";
	    }
	    System.out.println("점수는 "+score+"이고 GPA는 "+grade+"입니다.");
	    }
	}

