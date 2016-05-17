package ch05;
class Block {
	static { //static이 있어서 "클래스 초기화"는 한번만 출력된다.
		System.out.println("클래스 초기화");
	}
	{
		System.out.println("인스턴스 초기화");
	}
	}
public class BlockTest {
	public static void main(String[] args) {
		Block bt1 = new Block();
		Block bt2 = new Block();
		Block bt3 = new Block();
	}

}
