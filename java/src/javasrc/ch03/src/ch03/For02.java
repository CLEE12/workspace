package ch03;

public class For02 {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) { // 초기식; 조건식; 증감식
			System.out.print(i+" \t");
		}
		System.out.println(); // 비어있을 경우 \n의 역할을 수행
		for (int i = 10; i > 0; i--) {
			System.out.print(i+" \t");
		}
		System.out.println();
		for (int i = 1; i <= 10; i+=3) {
			System.out.print(i+" \t");
		}
		System.out.println();
		for (int i = 1; i < 10; i*=2) {
			System.out.print(i+" \t");
	}

	}
}