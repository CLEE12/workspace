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


/* ���ϴ� ���� �־ ����!
 * HashSet<Integer> hs = new HashSet<>();
   Random ran = new Random();
   while(hs.size() < 6) {
	   int num = ran.nextInt(45)+1;
	   hs.add(num);
	   }
   System.out.println(hs);
*/


/* ��ĳ�ʸ� �̿��� ����!
Scanner sc = new Scanner(System.in);
System.out.println("���� 1");
int num1 = sc.nextInt();
System.out.println("���� 2");
int num2 = sc.nextInt();
HashSet<Integer> hs = new HashSet<>();
hs.add(num1);
hs.add(num2);
//hs.add(7); //�ζǿ� ���ü��� ����. 
while(hs.size() < 6) {
	int num = (int)(Math.random()*45)+1;
	hs.add(num);
}
System.out.println(hs);
}

}

*/






