package ch03;

public class If8 {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		
		if (num < 10) 
			System.out.println("10미만의 값입니다.");
		else if (num < 100) 
			System.out.println("10이상 100미만의 값 입니다.");
		else if (num < 1000)
			System.out.println("100 이상 1000 미만의 값 입니다.");
		else if (num >= 1000)
			System.out.println("1000 이상의 값 입니다.");
	}

}
