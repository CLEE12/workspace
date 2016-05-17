package ch10;
import java.util.Scanner;
public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try { System.out.println("첫번째 숫자를 입력하세요");
			int num1 = Integer.parseInt(sc.nextLine());
			System.out.println("두번째 숫자를 입력하세요");
			int num2 = Integer.parseInt(sc.nextLine());
			System.out.printf("%d/%d=%d\n",num1,num2,num1/num2);
		}catch(NumberFormatException e) {
			System.out.println("그게 숫자냐 바보아냐");
		}catch(ArithmeticException e) {
			System.out.println("0으로 못나눠");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally{ System.out.println("난 무조건이야");  } //애러가 나든 말든 무조건 실행
		sc.close();
	}
}