package ch06;

class SingleTon2 {
	private static SingleTon instance;
    public SingleTon2() {}
    }

public class SingleTest2 {
	public static void main(String[] args) {
		SingleTest2 s1 = new SingleTest2();
		//SingleTon s1 = new SingleTon(); // <-- private�� ������ �� ���� �ַ� �߻�.
		SingleTest2 s2 = new SingleTest2();
		System.out.println(s1);
		System.out.println(s2);
	}

}
