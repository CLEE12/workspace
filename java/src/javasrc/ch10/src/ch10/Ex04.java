package ch10;
import java.util.*;
public class Ex04 {
	public static void main(String[] args) {
		int num1 = 0, num2 =0;
		Scanner sc = new Scanner(System.in);
		try {System.out.println("ù��° ���ڸ� �Է��ϼ���");
			num1 = sc.nextInt();
			System.out.println("�ι�° ���ڸ� �Է��ϼ���");
			num2 = sc.nextInt();
			System.out.printf("%d/%d = %d\n",num1,num2,num1/num2);
		}catch(Exception e) {
				System.out.println(e.getMessage());
//		}catch(ArithmeticException e) {
//			System.out.println("0���� ������");
//		}catch(InputMismatchException e) {
//			System.out.println("�װ� ���ڳ� ! ���̱�");
		}
		sc.close();
	}
}