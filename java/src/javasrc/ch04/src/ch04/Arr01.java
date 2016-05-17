package ch04;

public class Arr01 {
	public static void main(String[] args) {
		int[] a = new int[5];
		int b[]; //선언
		b = new int[5]; //생성 공간확보 4b * 5 =20b
		a[0] = 7;
		a[1] = 45;
		a[2] = 879;
		a[3] = 67;
		a[4] = 6;
	// 배열명.length는 배열의 갯수	
	//  a[5] = 67;
	// 공간 확보가 4까지 밖에 안된다.	
		for(int i = 0; i < 6; i++) {
			System.out.println("a["+i+"] = "+a[i]);
		}
		System.out.println("==================");
		// 확장 for
		for(int i : a) {
			System.out.println(i);
		}
	}

}
