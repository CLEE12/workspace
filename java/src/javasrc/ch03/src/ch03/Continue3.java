package ch03;

public class Continue3 {
	public static void main(String[] args) {
		a : for(int i=0; i<10; i++) {
			System.out.println("사건"+i);
			for(int j=0; j<10; j++) {
					System.out.println(" 안녕"+j);
			        if(j>2) continue a; 
			        //continue는 label이 있는가까운 반복문 처음으로 간다.
			        System.out.println("  대박"+j);
		}
	    System.out.println("사건"+i);
	}
}
}
