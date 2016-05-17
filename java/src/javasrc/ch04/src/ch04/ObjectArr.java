package ch04;

public class ObjectArr {
	public static void main(String[] args) {
		String[] str = {"Java","뭘잡아","Spring","겨울이야"};
		for(int i = 0; i<str.length; i++) {
			System.out.println(str[i]);
		}
		System.out.println("==============");
		for(String s : str) {
			//데이터형 변수명 : 배열명
			System.out.println(s);
		}
	}

}
