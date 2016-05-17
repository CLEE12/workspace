package ch05;

public class Area {
	public static void main(String[] args) {
		//final 변수는 대문자로 쓰는것을 권장. 작업중 파악하기 위해 대문자 or 표시.
		final double PI = 3.141592; 
		//final을 쓰게 되면 3.14에 해당하는 값을 변경할 수 없다.
		//final 변수에 정의된 값은 변경 불가
		int r = 10;
		int area = (int)(PI * r * r);
		//double area = pi * r * r;
		System.out.println("원의 면적 : "+area);
	}

}
