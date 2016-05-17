package ch06;

import java.util.Scanner;

class Fact3 {
	int result = 1;
	void fact(int x) {
	    if (x==1) {
	    	System.out.println(x+" = "+result);
	    	return;
			}
			else {
				result *= x;
				System.out.print(x+" * ");
				fact(--x);
	        }
        }
}


public class Fact3Ex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Fact3 f = new Fact3();
		System.out.println("보고싶은 팩토리얼 숫자는 ?");
		f.fact(sc.nextInt()); //Scanner를 지우고 f.fact(7);을 사용하면 scanner 없이 사용 가능
		sc.close();
	}
}