package ch11;

import java.util.HashSet;
import java.util.Scanner;

public class Lotto1 { //pure version of lottery machine
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		while(hs.size() < 6) {
			int num = (int)(Math.random()*45)+1;
			hs.add(num);
		}
		System.out.println(hs);
	}

}


/* 원하는 숫자 넣어서 주작!
 * HashSet<Integer> hs = new HashSet<>();
   Random ran = new Random();
   while(hs.size() < 6) {
	   int num = ran.nextInt(45)+1;
	   hs.add(num);
	   }
   System.out.println(hs);
*/


/* 스캐너를 이용한 주작!
Scanner sc = new Scanner(System.in);
System.out.println("숫자 1");
int num1 = sc.nextInt();
System.out.println("숫자 2");
int num2 = sc.nextInt();
HashSet<Integer> hs = new HashSet<>();
hs.add(num1);
hs.add(num2);
//hs.add(7); //로또에 선택숫자 주입. 
while(hs.size() < 6) {
	int num = (int)(Math.random()*45)+1;
	hs.add(num);
}
System.out.println(hs);
}

}

*/






