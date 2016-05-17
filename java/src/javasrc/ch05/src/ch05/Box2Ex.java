package ch05;

class Box2 {
	int num;
	static int count; //static이 있어서 중첩된다.
	void print() {
		System.out.println("num = "+num+", count = "+count);
	}

}

public class Box2Ex {
	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			Box2 b = new Box2();
			b.num++; //생성할 때 0에서 1증가
			b.count++; //증가된 값을 공유하므로 공유된 값에 1증가
			b.print();
		}
	}
}