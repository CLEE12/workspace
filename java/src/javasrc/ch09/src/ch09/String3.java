package ch09;

public class String3 {
	public static void main(String[] args) {
		char[] c1 = {'K', 'o', 'r', 'e', 'a'};
		String s1 = "Hello";
		String s2 = new String(c1);
		String s3 = new String(s1);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s1+s2+s3);
	}

}
