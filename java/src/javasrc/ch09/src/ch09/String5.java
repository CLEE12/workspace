package ch09;

public class String5 {
	public static void main(String[] args) {
		String s1 = "dog food lid";
		System.out.println(s1);
		System.out.println("Character length : "+s1.length());
		//length() 문자열 길이
		for (int i=s1.length()-1; i>=0; i--) {
			//charAt(인덱스) 인덱스에 있는 문자 한자 읽기.
			System.out.print(s1.charAt(i));
		}
	}

}
