package ch04;

public class Test2 {
	public static void main(String[] args) {
		int[] amt = {76, 45, 34, 89, 100, 50, 90 ,92};
		int imsi = 0;
		for(int i = 0; i < amt.length; i++) {
			for(int j = i+1; j < amt.length; j++) {
				if(amt[i] > amt[j]) { // <�� �ٲٸ� ū������ �迭
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
