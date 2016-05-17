package ch06;

import java.util.Scanner;

class Fact1 { //scanner를 사용해서 푸는 팩토리얼
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
		System.out.println("보고싶은 팩토리얼 숫자는 ?");
		f.fact(sc.nextInt()); //Scanner를 지우고 f.fact(7);을 사용하면 scanner 없이 사용 가능
		sc.close();
	}
}

/*{ 인터넷 답안. 
      public static void main(String[] args) { 
            System.out.println(팩토리얼(5)); 
            System.out.println(재귀팩토리얼(5)); 
      } 
      public static long 팩토리얼(int num) { 
            long result=1; 
            for(int i=num;i>=1;i--) { 
                  result = result * i;                   
            } 

            return result; 
      } 

      public static long 재귀팩토리얼(int num) { 
            if(num==1) return 1; 
            return num * 재귀팩토리얼(num-1); 
            // return (num==1)? 1 : num * 재귀팩토리얼(num-1); 
      } 
}
*/