package ch03;
public class If9 {
	public static void main(String[] args) {
		int season = Integer.parseInt(args[0]);
		/*String season = "�Ǥ�"
		if (season >= 1 && seseon <= 12) {�߰�ȣ}�� 
		esle���� ������ 1~12�������� ǥ���� �� �ִ�.*/
		if      (season == 0)  
	                  System.out.println("����");
		else if (season == 12 || season == 1 || season == 2)
		              System.out.println("�ܿ��Դϴ�.");
		else if (season <= 5)
			          System.out.println("���Դϴ�.");
		else if (season <= 8)
			          System.out.println("�����Դϴ�.");
		else if (season <= 11)
			          System.out.println("�����Դϴ�.");
		else System.out.println("��������!");			
		
	}

}
