package ch04;

public class Arr04 {
	public static void main(String[] args) {
		//������Ȳ
		int[] amt = {100, 170, 340, 235, 124, 540, 230, 235};
		int tot = 0;
		//1)int avg = 0; <--length ������ ���ǹ�
		/*2)for(int i = 0; i <amt.length;i++) {
		      tot += amt[i];
		
		*/
		for(int sc : amt) {
			tot += sc;
		//3)int avg = tot/amt.length; <--�������� �̰��߿� ����	
		
		}
		System.out.println("�հ� : "+tot);
		System.out.println("��� : "+tot/amt.length); //amt.length�� amt�� ������
	}

}
