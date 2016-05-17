package ch03;

public class If2 {
	public static void main(String[] args) {
		int i1 = Integer.parseInt(args[0]); // 조건문에 대한 영향은 바로 아래 {중괄호}에만 적용된다.
		if (i1 > 10) { //jaca\src\javaSrc\ch03 에서 cmd로 값을 조정
			System.out.println("i1은 10보다 크다.");
		    System.out.println("i1 = "+i1);
		}
		System.out.println("프로그램 끝");
	
	}

}
