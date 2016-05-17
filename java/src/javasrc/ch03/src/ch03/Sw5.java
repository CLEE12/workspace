package ch03;
public class Sw5 {
	public static void main(String[] args) {
		int season = Integer.parseInt(args[0]);
		switch (season) {
		  case 12:  case 1 :  case 2 :  
			  System.out.println("Winter is comin'\n -house Stark"); break;
		  case 3 :  case 4 :  case 5 : 
			  System.out.println("봄입니다."); break;
		  case 6 :  case 7 :  case 8 : 
			  System.out.println("여름입니다."); break;
		  case 9 :  case 10:  case 11: 
			  System.out.println("가을입니다."); break;
		  default : System.out.println("없어"); break;
		}
	}

}
