package ch03;

public class Continue2 {
	public static void main(String[] args) {
			for(int j=0; j<10; j++) {
					System.out.println("�ȳ�"+j);
			        if(j>5) continue; //continue�� ������ �ݺ��� ó������ ����.
			        System.out.println("���");
		}
	    System.out.println("���");
	}
}

