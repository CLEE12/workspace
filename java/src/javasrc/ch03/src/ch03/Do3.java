package ch03;

public class Do3 {
	public static void main(String[] args) {
		System.out.println("������ �� �����մϴ�.");
		int i = 1, j = 2;
		do {
			do {
				System.out.print(j+" * "+i+" = "+i*j+"\t");
				j++;
			}while(j <= 9);
			System.out.println(); // �ٹٲٱ�
			i++;
			j = 2;
	    }while(i <= 9);
	}
}
