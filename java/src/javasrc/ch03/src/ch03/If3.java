package ch03;

public class If3 {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]); //cmd에 입력되는 값이 나타남.
		if (num >= 10) {
			System.out.println("10보다 크다");
			System.out.println("입력된 값은 "+num+"이다.");
		} else { //if의 조건에 모두 true일 경우 위에 식이 나타나고, 아닐경우 else의 식이 나타남.
			System.out.println("10보다 작다");
			System.out.println("헐 ㅠㅠ");
		}
		System.out.println("프로그램 끝"); //{중괄호} 밖의 이 문장은 if 와 else 모두에서 나타남.
	}

}
