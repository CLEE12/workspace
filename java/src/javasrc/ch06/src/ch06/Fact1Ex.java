package ch06;

import java.util.Scanner;

class Fact1 { //scanner�� ����ؼ� Ǫ�� ���丮��
	void fact(int x) {
		int result = 1;
		for(int i=x; i>=1; i--) {
			if(i>1) {
				System.out.print(i+" * ");
			    result *= i;
			}
			else {
				System.out.println(i+" = "+result);
		    }
	    }
	}
}


public class Fact1Ex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Fact1 f = new Fact1();
		System.out.println("������� ���丮�� ���ڴ� ?");
		f.fact(sc.nextInt()); //Scanner�� ����� f.fact(7);�� ����ϸ� scanner ���� ��� ����
		sc.close();
	}
}

/*{ ���ͳ� ���. 
      public static void main(String[] args) { 
            System.out.println(���丮��(5)); 
            System.out.println(������丮��(5)); 
      } 
      public static long ���丮��(int num) { 
            long result=1; 
            for(int i=num;i>=1;i--) { 
                  result = result * i;                   
            } 

            return result; 
      } 

      public static long ������丮��(int num) { 
            if(num==1) return 1; 
            return num * ������丮��(num-1); 
            // return (num==1)? 1 : num * ������丮��(num-1); 
      } 
}
*/