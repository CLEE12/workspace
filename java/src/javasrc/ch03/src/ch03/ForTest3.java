package ch03;

public class ForTest3 {
	public static void main(String[] args) {
		/*
		 * �ֻ���(1~6)�� ������ �μ��� ���� 6�� �Ǵ� ��츦 ���
		 1+5=6 2+4=6 ------ 5+1=6
		 */
		for(int d=1; d<=6; d++) { //1�� �ֻ���
			for(int i=1; i<=6; i++) { //2�� �ֻ���
				if(d+i==6) //d�� i�� ���� 6�̶��, ���
				System.out.println("6�� �Ǵ� ����� �� : "+d+", "+i);
			}
		}
	}

}
