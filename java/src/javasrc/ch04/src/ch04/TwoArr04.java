package ch04;

public class TwoArr04 {
	public static void main(String[] args) {
		int sum = 0;
		String[] title = {"����","����","����","����","���"}; //�迭 []
		int[][] score = {{76,98,89},{54,87,98},{78,89,98}}; //�����迭[][]
		
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
			sum=0; //sum�� 0���� �ʱ�ȭ ������� ��. �ȱ׷��� ������ ����� ��ø��� ��.
		}
	}
}
