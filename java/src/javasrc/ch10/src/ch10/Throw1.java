package ch10;
public class Throw1 {
	public static void main(String[] args) throws Exception {
		System.out.println("Throw Test");
		try {
			throw new Exception("���� ���� �߻����״�");
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		throw new Exception("�� ���� ��ճ�");
	}

}
