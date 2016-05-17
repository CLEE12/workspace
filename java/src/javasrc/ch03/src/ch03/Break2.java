package ch03;

public class Break2 {
	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			System.out.println();
			for(int j=0; j<10; j++) {
				if (j==5) break; //break는 반복문 1번만 벗어난다.
				System.out.print("i="+i+", j="+j+"\t");
			}
		}
	}

}
