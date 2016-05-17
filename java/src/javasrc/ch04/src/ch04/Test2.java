package ch04;

public class Test2 {
	public static void main(String[] args) {
		int[] amt = {76, 45, 34, 89, 100, 50, 90 ,92};
		int imsi = 0;
		for(int i = 0; i < amt.length; i++) {
			for(int j = i+1; j < amt.length; j++) {
				if(amt[i] > amt[j]) { // <로 바꾸면 큰수부터 배열
					imsi = amt[i];
					amt[i] = amt[j];
					amt[j] = imsi;
				}
			}
		}
		for(int i = 0; i < amt.length; i++) {
			System.out.print(amt[i]+" ");
		}
	}

}
