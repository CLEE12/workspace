package ch03;

public class For02 {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) { // �ʱ��; ���ǽ�; ������
			System.out.print(i+" \t");
		}
		System.out.println(); // ������� ��� \n�� ������ ����
		for (int i = 10; i > 0; i--) {
			System.out.print(i+" \t");
		}
		System.out.println();
		for (int i = 1; i <= 10; i+=3) {
			System.out.print(i+" \t");
		}
		System.out.println();
		for (int i = 1; i < 10; i*=2) {
			System.out.print(i+" \t");
	}

	}
}