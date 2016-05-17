package ch02;

public class Oper09 {
	public static void main(String[] args) {
		int i1 = 1000000, i2 = 2000000;
		long l1 = (long)i1 * i2; 
		/*int를 사용하면 err는 안나지만 쓰레기 값이 나옴. 
		int는 21억까지 가능한데 145억이 나옴.
		그래서 (long)을 붙여서 형변환.*/
		System.out.println("l1 = "+l1);
		
	}

}
