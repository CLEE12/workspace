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
		System.out.println("������� ���丮�� ���ڴ� ?");
		f.fact(sc.nextInt()); //Scanner�� ����� f.fact(7);�� ����ϸ� scanner ���� ��� ����
		sc.close();
	}
}