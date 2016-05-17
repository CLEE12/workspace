package ch04;

public class Arr03 {
	public static void main(String[] args) {
		int kor = 70, eng = 80, math = 90;
		int sum1 = kor + eng + math;
		int sum2 = 0;
		System.out.println("합계 : "+sum1);
		int[] score = {70, 80, 90};
		for (int sc : score) {
			sum2 += sc;
		}
		System.out.println("합계 : "+sum2);
	}
}
