package ch03;

public class WhileQ {
	public static void main(String[] args) {
		// �Է� ���ο� ���� in.read�� ������� ���� �Ǵ��Ѵ�.
		int sum = 0;  
	    int a   = 1;  // ������ �׻� ��ܺο� ��ġ�Ѵ�.
		while (a <= 10) { //���� ������ ���� �ۼ��Ѵ�.
			sum += a; 
			System.out.println("i�� "+a+"�� ��, sum�� "+sum+"�̴�.");
			a++;		
		}
	}
}
