package ch04;

public class Arr01 {
	public static void main(String[] args) {
		int[] a = new int[5];
		int b[]; //����
		b = new int[5]; //���� ����Ȯ�� 4b * 5 =20b
		a[0] = 7;
		a[1] = 45;
		a[2] = 879;
		a[3] = 67;
		a[4] = 6;
	// �迭��.length�� �迭�� ����	
	//  a[5] = 67;
	// ���� Ȯ���� 4���� �ۿ� �ȵȴ�.	
		for(int i = 0; i < 6; i++) {
			System.out.println("a["+i+"] = "+a[i]);
		}
		System.out.println("==================");
		// Ȯ�� for
		for(int i : a) {
			System.out.println(i);
		}
	}

}
