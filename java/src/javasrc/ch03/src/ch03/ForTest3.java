package ch03;

public class ForTest3 {
	public static void main(String[] args) {
		/*
		 * 주사위(1~6)를 던져서 두수의 합이 6이 되는 경우를 출력
		 1+5=6 2+4=6 ------ 5+1=6
		 */
		for(int d=1; d<=6; d++) { //1번 주사위
			for(int i=1; i<=6; i++) { //2번 주사위
				if(d+i==6) //d랑 i가 합이 6이라면, 출력
				System.out.println("6이 되는 경우의 수 : "+d+", "+i);
			}
		}
	}

}
