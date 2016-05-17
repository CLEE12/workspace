package ch03;
public class If9 {
	public static void main(String[] args) {
		int season = Integer.parseInt(args[0]);
		/*String season = "ㅗㅗ"
		if (season >= 1 && seseon <= 12) {중괄호}로 
		esle까지 묶으면 1~12월까지만 표시할 수 있다.*/
		if      (season == 0)  
	                  System.out.println("ㄴㄴ");
		else if (season == 12 || season == 1 || season == 2)
		              System.out.println("겨울입니다.");
		else if (season <= 5)
			          System.out.println("봄입니다.");
		else if (season <= 8)
			          System.out.println("여름입니다.");
		else if (season <= 11)
			          System.out.println("가을입니다.");
		else System.out.println("정신차려!");			
		
	}

}
