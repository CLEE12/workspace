package ch09;
import java.util.Random;
public class Random2Ex {
	public static void main(String[] args) {
		int[] number = new int[100];  int[] count = new int[10];
		Random ran = new Random();
		for (int i = 0; i < number.length;i++) {			
			number[i]=ran.nextInt(10); // number[i] 0~9���� ������
			System.out.print(number[i]+"  ");
			if (i%10==9) System.out.println(); //0���� �����ؼ� 9�� ������ 10���� ������ �������� 9�̹Ƿ� �ٹٲ�.
		}
		for(int i=0;i< number.length;i++) {
			count[number[i]]++;	} //number[i]�� ����ִ� counter �ε����� 1����
		for (int i=0; i < count.length ; i++ ) {
			System.out.println( i +"�� ���� :"+ 
					printGraph('#',count[i]) + " " + count[i]);
		}
	}
	public static String printGraph(char ch, int value) { 
		char[] bar = new char[value]; 
		for(int i=0; i < bar.length; i++) { 
			bar[i] = ch; } 
		return new String(bar); 
	}
}