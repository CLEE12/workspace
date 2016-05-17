package ch04;

public class TwoArr04 {
	public static void main(String[] args) {
		int sum = 0;
		String[] title = {"국어","영어","수학","총점","평균"}; //배열 []
		int[][] score = {{76,98,89},{54,87,98},{78,89,98}}; //이차배열[][]
		
		for(String tit : title) {
			System.out.print(tit+"\t");
		}
		System.out.println();
		for(int i=0; i<35; i++) {
			System.out.print("=");
		}
		System.out.println();
		for(int[] sc : score) {
			for(int s: sc) {
				sum += s;
				System.out.print(s+"\t");
			}
			System.out.println(sum+"\t"+sum/sc.length);
			sum=0; //sum은 0으로 초기화 시켜줘야 함. 안그러면 총점과 평균을 중첩계산 함.
		}
	}
}
