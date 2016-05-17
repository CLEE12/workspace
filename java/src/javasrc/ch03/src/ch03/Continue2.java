package ch03;

public class Continue2 {
	public static void main(String[] args) {
			for(int j=0; j<10; j++) {
					System.out.println("안녕"+j);
			        if(j>5) continue; //continue를 만나면 반복문 처음으로 간다.
			        System.out.println("대박");
		}
	    System.out.println("사건");
	}
}

