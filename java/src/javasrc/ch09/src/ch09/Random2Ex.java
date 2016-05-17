package ch09;
import java.util.Random;
public class Random2Ex {
	public static void main(String[] args) {
		int[] number = new int[100];  int[] count = new int[10];
		Random ran = new Random();
		for (int i = 0; i < number.length;i++) {			
			number[i]=ran.nextInt(10); // number[i] 0~9사이 정수값
			System.out.print(number[i]+"  ");
			if (i%10==9) System.out.println(); //0부터 시작해서 9가 됐을때 10으로 나누면 나머지가 9이므로 줄바꿈.
		}
		for(int i=0;i< number.length;i++) {
			count[number[i]]++;	} //number[i]가 들어있는 counter 인덱스에 1증가
		for (int i=0; i < count.length ; i++ ) {
			System.out.println( i +"의 개수 :"+ 
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