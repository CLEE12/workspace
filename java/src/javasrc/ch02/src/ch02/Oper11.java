package ch02;

public class Oper11 {
	public static void main(String[] args) {
		char c1 = 'c'; //char은 ''를 입력해 문자화 시켜줘야 함.
		char c2 = (char)(c1 + 1);
		//char c2 = c1 + 1 -> char로 형변환을 해줘야 함.
		System.out.println("c2 = "+c2);
		
		char c3 = ++c1;
		//++를 입력함으로서 int형으로의 변환이 아닌 ASCII 코드를 사용해서 (char)를 입력하지 않아도 됨. 
		System.out.println("c3 = "+c3);
		
		int i1 = 'c' - 'a'; // 알파벳 a와 c에 해당하는 ASCII 코드 값의 차.
		int i2 = '8' - '0'; // 숫자 8와 0에 해당하는 ASCII 코드 값의 차.
		int i3 = '0'; // ASCII 코드 '0'은 48
		System.out.println("i1 = "+i1);
		System.out.println("i2 = "+i2);
		System.out.println("i3 = "+i3);
		
	}

}
