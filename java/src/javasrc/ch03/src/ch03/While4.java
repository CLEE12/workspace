package ch03;

public class While4 {
	public static void main(String[] args) {
		System.out.println("������\n");
		int i = 1, j = 2;
		while(i <= 9) {  // ; ���� �ʴ´�.
			while(j <= 9) {
				System.out.print(j+" * "+i+" = "+i*j+"\t"); //tap 7ĭ ������.
				j++;
			}
			System.out.println(); //�� �ٲٱ�
			i++; // i 1����
			j = 2; // j �ʱ�ȭ
		}
	}

}
