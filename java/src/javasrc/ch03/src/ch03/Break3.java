package ch03;

public class Break3 {
	public static void main(String[] args) {
		k : for(int i=0; i<10; i++) { //Label의 이름이 k
			System.out.println();
			for(int j=0; j<10; j++) {
				if (j==5) break k; //break는 label이 있는 반복문을 벗어난다.
				System.out.print("i="+i+", j="+j+"\t");
			}
		}
	}

}
