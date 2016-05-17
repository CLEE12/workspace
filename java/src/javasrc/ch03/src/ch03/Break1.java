package ch03;

public class Break1 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=100; i++) {
			sum += i;
			if (i==50) break; //break를 만나면 반복문을 벗어난다.
		}
		System.out.println("합계 : "+sum);
	}

}
