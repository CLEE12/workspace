package ch03;

public class If3 {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]); //cmd�� �ԷµǴ� ���� ��Ÿ��.
		if (num >= 10) {
			System.out.println("10���� ũ��");
			System.out.println("�Էµ� ���� "+num+"�̴�.");
		} else { //if�� ���ǿ� ��� true�� ��� ���� ���� ��Ÿ����, �ƴҰ�� else�� ���� ��Ÿ��.
			System.out.println("10���� �۴�");
			System.out.println("�� �Ф�");
		}
		System.out.println("���α׷� ��"); //{�߰�ȣ} ���� �� ������ if �� else ��ο��� ��Ÿ��.
	}

}
