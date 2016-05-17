package Study;

import java.util.Scanner;

public class Random {

   public static void main(String[] args) {
      String[] a = new String[9];
      int[] ran = new int[9];
      Scanner sc = new Scanner(System.in);

      int b;
      for (b = 0; b < a.length; b++) {
         System.out.println("이름을 입력하세요");
         String str = sc.nextLine();
         a[b] = str;
      }
      sc.close();

      for (int i = 0; i < ran.length; i++) {

         ran[i] = (int) (Math.random() * 9);

         for (int j = 0; j < i; j++) {
         
            if (ran[j] == ran[i]) {
               i--;
            } 

         }

      }

      for (int i = 0; i < a.length; i++) {
         int temp = ran[i];
         System.out.print(a[temp]+"\t\t");

         if (i % 3 == 2)
            System.out.println();

      }
   }
}