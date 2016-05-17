package ch09;

public class String4 {
	public static void main(String[] args) {
		System.out.println(2+0+0+2+"월드컵"); //숫자가 먼저 시작되면 계산을 하고 문자 출력
		System.out.println("월드컵"+2+0+0+2); //문자가 먼저 시작되면 뒤에것을 문자로 인식.
		
		System.out.println(""+2+0+0+2+"월드컵"); //앞에 ""가 붙어서 문자로 인식함.
		System.out.println("월드컵"+(2+0+0+2)); //괄호안에 들었기 때문에 문자가 앞에 나와있어도 계산을 함.
	}

}
