package ch04;

public class Test1 {
	public static void main(String[] args) {
		int[] i1 = {76, 45, 34, 89, 100, 50, 90 ,92};
		int max =0, min = 200, sum = 0;
		
		for(int i = 0; i < i1.length; i++){
			sum += i1[i];
			if (i1[i] > max) max=i1[i];
			if (i1[i] < min) min=i1[i];
			
		}
		/*for(int k : i1){
			sum += i1[k];
			if (i1[k] > max) max=i1[k];
			if (i1[k] < min) min=i1[k];
		*/
		//Ȯ�� for��
		System.out.println("�հ� : "+sum);
		System.out.println("��� : "+sum/i1.length);
		System.out.println("�ִ� : "+max);
		System.out.println("�ּ� : "+min);
		}
	}
