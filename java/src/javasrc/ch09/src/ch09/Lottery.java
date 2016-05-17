package ch09;

public class Lottery {
	public static void main(String[] args) {
		//1~45 숫자 중에서 중복되지 않는 6개
		int[] num = new int[5];
		for(int i=0; i<num.length; i++) {
			int ran = (int)(Math.random()*75) +1;
			num[i] = ran;
			for(int j=i-1; j>=0; j--) {
				if(num[i]==num[j]) {
					i--;
					break;
				}
			}
		}
		int[] num1 = new int[1];
		for(int i=0; i<num1.length; i++) {
			int ran = (int)(Math.random()*15) +1;
			num1[i] = ran;
			for(int j=i-1; j>=0; j--) {
				if(num1[i]==num1[j]) {
					i--;
					break;
				}
			}
		}
		for(int n : num) {
			System.out.println(n);
		}
		for(int n1 : num1) {
			System.out.println("your jackpot number is : "+n1);
		}
	}
}
