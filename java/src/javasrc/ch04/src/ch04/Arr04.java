package ch04;

public class Arr04 {
	public static void main(String[] args) {
		//매출현황
		int[] amt = {100, 170, 340, 235, 124, 540, 230, 235};
		int tot = 0;
		//1)int avg = 0; <--length 때문에 노의미
		/*2)for(int i = 0; i <amt.length;i++) {
		      tot += amt[i];
		
		*/
		for(int sc : amt) {
			tot += sc;
		//3)int avg = tot/amt.length; <--위에꺼랑 이것중에 선택	
		
		}
		System.out.println("합계 : "+tot);
		System.out.println("평균 : "+tot/amt.length); //amt.length는 amt의 갯수ㅜ
	}

}
