package ch10;
import java.util.Scanner;
public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try { System.out.println("ù��° ���ڸ� �Է��ϼ���");
			int num1 = Integer.parseInt(sc.nextLine());
			System.out.println("�ι�° ���ڸ� �Է��ϼ���");
			int num2 = Integer.parseInt(sc.nextLine());
			System.out.printf("%d/%d=%d\n",num1,num2,num1/num2);
		}catch(NumberFormatException e) {
			System.out.println("�װ� ���ڳ� �ٺ��Ƴ�");
		}catch(ArithmeticException e) {
			System.out.println("0���� ������");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally{ System.out.println("�� �������̾�");  } //�ַ��� ���� ���� ������ ����
		sc.close();
	}
}