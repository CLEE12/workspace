package ch02;
public class SpecialChar {
	public static void main(String[] args) {
		// \n은 줄바꿈
		System.out.println("대박\n");
		System.out.println("사건");
		System.out.println("대\t박\t사\t건");
		// \t는 탭
		System.out.println("대박사건");
		System.out.println("\\ \' \"");
		//System.out.println("\\ \' "");
		// \는 뒤에있는 문자를 그대로 사용 ->
		// \\는 back slash 출력
		// \'는 sing quote 출력
		// \"는 double quote 출력
	}
}