package ch02;
public class Unicode1 {
	public static void main(String[] args) {
		// %s 문자열, %d 숫자, %c 문자
		// \n은 줄바꿈
		System.out.printf("숫자 %c의 유니코드 값은 %d이다\n",'0',(int)'0');
		System.out.printf("숫자 %c의 유니코드 값은 %d이다\n",'a',(int)'a');
		System.out.printf("문자 %c의 유니코드 값은 %d이다\n",'A',(int)'A');
		System.out.printf("숫자 %c의 유니코드 값은 %d이다\n",'A'+1,(int)'A'+1);
		//(int)'A'는 형변환.
	}
}