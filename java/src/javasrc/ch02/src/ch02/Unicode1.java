package ch02;
public class Unicode1 {
	public static void main(String[] args) {
		// %s ���ڿ�, %d ����, %c ����
		// \n�� �ٹٲ�
		System.out.printf("���� %c�� �����ڵ� ���� %d�̴�\n",'0',(int)'0');
		System.out.printf("���� %c�� �����ڵ� ���� %d�̴�\n",'a',(int)'a');
		System.out.printf("���� %c�� �����ڵ� ���� %d�̴�\n",'A',(int)'A');
		System.out.printf("���� %c�� �����ڵ� ���� %d�̴�\n",'A'+1,(int)'A'+1);
		//(int)'A'�� ����ȯ.
	}
}