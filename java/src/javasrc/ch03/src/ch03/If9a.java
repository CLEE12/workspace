package ch03;
public class If9a {
	public static void main(String[] args) {
		int month = Integer.parseInt(args[0]);
		String str = "죽을래";
		if (month >= 1 && month <= 12) {
	    if (month == 12 || month == 1 || month ==2) str = "겨울";
	    else if (month == 3 || month == 4 || month == 5) str = "봄";
		else if (month == 6 || month == 7 || month == 8) str = "여름";
		else str = "가을";}
	    
	    System.out.print(str+"입니다.");
		}
	}
