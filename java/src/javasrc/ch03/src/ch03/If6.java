package ch03;

public class If6 {
	public static void main(String[] args) {
		int score = Integer.parseInt(args[0]);
	    String grade = "";
	    if (score >= 90) {grade = "A";
	                      if (score >97) grade +="+";
	                      else if (score <94) grade +="-";
	                      else grade += "0";}
	    
	    else if (score >= 80) {grade = "B";
                          if (score >87) grade +="+";
                          else if (score <84) grade +="-";
                          else grade += "0";}
	    
	    else if (score >= 70) {grade = "C";
                          if (score >77) grade +="+";
                          else if (score <74) grade +="-";
                          else grade += "0";}
	    
	    else if (score >= 60) {grade = "D";
                          if (score >67) grade +="+";
                          else if (score <64) grade +="-";
                          else grade += "0";}
	    else grade = "�����Ǥ�";
	    
	    System.out.println("������ "+score+"�̰� GPA�� "+grade+"�Դϴ�.");


	    
	    }
	}

