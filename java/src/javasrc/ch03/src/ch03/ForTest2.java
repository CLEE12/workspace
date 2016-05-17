package ch03;

public class ForTest2 {
	public static void main(String[] args) {
		// 1+(1+2)+(1+2+3)+.....(1+2+3+4+5+...9+10)의 결과
		int sum = 0, total = 0;
		for (int i=1; i<=10; i++) {
			sum+=i;
			total+=sum;
			System.out.print("i : "+i+"\t");
			System.out.print("합계 : "+sum+"\t");
			System.out.println("총계 : "+total+"\t");
		}
		System.out.println("합계 : "+sum);
		System.out.println("총계 : "+total);
	}

}
