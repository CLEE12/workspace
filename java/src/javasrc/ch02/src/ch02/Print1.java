package ch02;
public class Print1 {
	public static void main(String[] args) {
		System.out.printf("%d\n",16);
		//16출력
		System.out.printf("%5d\n",16);
		//5칸 확보하고 우측을 기준 16
		System.out.printf("%-5d\n",16);
		//5칸 확보하고 좌측을 기준 16
		System.out.printf("%05d\n",16);
		//5칸 확보하고 우측을 기준 16 빈칸은 0으로 채움
	}
}
