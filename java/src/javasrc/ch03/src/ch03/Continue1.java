package ch03;

public class Continue1 {
	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
					System.out.println("�ȳ�"+j);
			        if(j>5) continue; //continue�� ����� �ݺ��� ó������ ����.
			        System.out.println("���"+j);
		}
	    System.out.println("���"+i);
	}
}
}
