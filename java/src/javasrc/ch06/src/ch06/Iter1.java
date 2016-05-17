package ch06;

public class Iter1 {         //static 정적, 공유의 의미
	static void hi(int k) {  //static 메소드는 객체 생성하지 않고 사용 가능.
		// return 여기하고 이 메소드를 호출한 것으로 돌아가라
		// return a; return 뒤에 있는 값을 호출한 것으로 반환해라.
		System.out.println("Hi! 왜 이하이야?");
		if(k<0) return;
		hi(--k);
	}
	public static void main(String[] args) {
		
	}

}
