package ch03;

public class While4 {
	public static void main(String[] args) {
		System.out.println("구구단\n");
		int i = 1, j = 2;
		while(i <= 9) {  // ; 하지 않는다.
			while(j <= 9) {
				System.out.print(j+" * "+i+" = "+i*j+"\t"); //tap 7칸 떨어짐.
				j++;
			}
			System.out.println(); //줄 바꾸기
			i++; // i 1증가
			j = 2; // j 초기화
		}
	}

}
