package ch03;

import java.io.IOException;

public class Input1 {
	public static void main(String[] args) throws IOException {
		System.out.println("숫자 한자를 입력하세요");
		int a = System.in.read(); //System.in.read(); == input
		//a에 -48이나 '0'을 추가하면 입력한 값이 나온다.
		System.out.println("a = "+a);
		// cmd에서 실행하면 ASCII 값이 나옴.
	}

}
