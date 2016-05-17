package ch03;

public class While2 { //while은 조건에 맞을때까지 계속 실행한다.
	public static void main(String[] args) {
		int sum = 0, a = 0;
		while(a < 10) {
			a++;
			sum += a;
		}
		System.out.println("합계 : "+sum);
	}
	
}