package ch05;
class Block {
	static { //static�� �־ "Ŭ���� �ʱ�ȭ"�� �ѹ��� ��µȴ�.
		System.out.println("Ŭ���� �ʱ�ȭ");
	}
	{
		System.out.println("�ν��Ͻ� �ʱ�ȭ");
	}
	}
public class BlockTest {
	public static void main(String[] args) {
		Block bt1 = new Block();
		Block bt2 = new Block();
		Block bt3 = new Block();
	}

}
