package ch04;

public class ObjectArr {
	public static void main(String[] args) {
		String[] str = {"Java","�����","Spring","�ܿ��̾�"};
		for(int i = 0; i<str.length; i++) {
			System.out.println(str[i]);
		}
		System.out.println("==============");
		for(String s : str) {
			//�������� ������ : �迭��
			System.out.println(s);
		}
	}

}
