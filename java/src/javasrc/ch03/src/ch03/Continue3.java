package ch03;

public class Continue3 {
	public static void main(String[] args) {
		a : for(int i=0; i<10; i++) {
			System.out.println("���"+i);
			for(int j=0; j<10; j++) {
					System.out.println(" �ȳ�"+j);
			        if(j>2) continue a; 
			        //continue�� label�� �ִ°���� �ݺ��� ó������ ����.
			        System.out.println("  ���"+j);
		}
	    System.out.println("���"+i);
	}
}
}
