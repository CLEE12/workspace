package ch09;

public class String5 {
	public static void main(String[] args) {
		String s1 = "dog food lid";
		System.out.println(s1);
		System.out.println("Character length : "+s1.length());
		//length() ���ڿ� ����
		for (int i=s1.length()-1; i>=0; i--) {
			//charAt(�ε���) �ε����� �ִ� ���� ���� �б�.
			System.out.print(s1.charAt(i));
		}
	}

}
