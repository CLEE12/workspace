package ch03;

public class Break2 {
	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			System.out.println();
			for(int j=0; j<10; j++) {
				if (j==5) break; //break�� �ݺ��� 1���� �����.
				System.out.print("i="+i+", j="+j+"\t");
			}
		}
	}

}
