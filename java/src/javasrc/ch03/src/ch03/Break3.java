package ch03;

public class Break3 {
	public static void main(String[] args) {
		k : for(int i=0; i<10; i++) { //Label�� �̸��� k
			System.out.println();
			for(int j=0; j<10; j++) {
				if (j==5) break k; //break�� label�� �ִ� �ݺ����� �����.
				System.out.print("i="+i+", j="+j+"\t");
			}
		}
	}

}
