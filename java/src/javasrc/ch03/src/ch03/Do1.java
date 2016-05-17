package ch03;

public class Do1 {
	public static void main(String[] args) {
		int i1 = 1, sum = 0;
		do{
			sum += i1; // sum = sum + i1
			System.out.println(i1+"까지 합 : "+sum);
			i1++; // 이거 설정 안되면 무한대로 +1만 중첩계산 함.
		} while(i1 <= 10); //이것 역시 설정이 안되면 무한 +
		
	}

}
