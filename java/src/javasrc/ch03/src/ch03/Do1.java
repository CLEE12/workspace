package ch03;

public class Do1 {
	public static void main(String[] args) {
		int i1 = 1, sum = 0;
		do{
			sum += i1; // sum = sum + i1
			System.out.println(i1+"���� �� : "+sum);
			i1++; // �̰� ���� �ȵǸ� ���Ѵ�� +1�� ��ø��� ��.
		} while(i1 <= 10); //�̰� ���� ������ �ȵǸ� ���� +
		
	}

}
