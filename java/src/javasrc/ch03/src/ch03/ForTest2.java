package ch03;

public class ForTest2 {
	public static void main(String[] args) {
		// 1+(1+2)+(1+2+3)+.....(1+2+3+4+5+...9+10)�� ���
		int sum = 0, total = 0;
		for (int i=1; i<=10; i++) {
			sum+=i;
			total+=sum;
			System.out.print("i : "+i+"\t");
			System.out.print("�հ� : "+sum+"\t");
			System.out.println("�Ѱ� : "+total+"\t");
		}
		System.out.println("�հ� : "+sum);
		System.out.println("�Ѱ� : "+total);
	}

}
