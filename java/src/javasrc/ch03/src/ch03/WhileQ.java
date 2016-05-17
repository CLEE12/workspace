package ch03;

public class WhileQ {
	public static void main(String[] args) {
		// 입력 여부에 따라 in.read를 사용할지 말지 판단한다.
		int sum = 0;  
	    int a   = 1;  // 변수는 항상 상단부에 위치한다.
		while (a <= 10) { //변수 다음에 조건 작성한다.
			sum += a; 
			System.out.println("i가 "+a+"일 때, sum은 "+sum+"이다.");
			a++;		
		}
	}
}
