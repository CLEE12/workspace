package ch02;

public class Oper10 {
	public static void main(String[] args) {
		long l1 = 1000000*1000000; // <-- 쓰레기값 산출. int x int라서 그럼
		long l2 = 1000000*1000000l; // <-- 뒤에 L을 붙혀서 Long으로 연산 한다.
		// long으로 선언하고 정수를 쓰게되면 계산은 int로 하게 됨. 그래서 뒤에 L을 붙힘.
		System.out.println("l1 = "+l1);
		System.out.println("l2 = "+l2);
		System.out.println("*부터 먼저 계산 = "+1000000*1000000/1000000);
		System.out.println("/부터 먼저 계산 = "+1000000/1000000*1000000);
		System.out.println("L입력 후 *부터 먼저 계산 = "+1000000l*1000000/1000000);
		System.out.println("L입력 후 /부터 먼저 계산 = "+1000000l/1000000*1000000);
	}

}
