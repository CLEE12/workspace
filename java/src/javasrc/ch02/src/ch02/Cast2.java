package ch02;
public class Cast2 {
	public static void main(String[] args) {
		long no = 99l;
		int num = (int)no;
		long no1 = 5;
		int num1 = (int)99l;
		double z = 12.414;
		float z1 = 12.414f;
		float z2 = (float)12.414;
		int i1 = (int)z1;
		
		System.out.println("i1 ="+i1);
		
		System.out.println("no = "+no);
		System.out.println("num = "+num);
		System.out.println("no1 = "+no1);
		System.out.println("num1 = "+num1);
		System.out.println("z = "+z);
		System.out.println("z1 = "+z1);
		System.out.println("z2 = "+z2);
		
		int g1 = 78;
		char c = (char)g1;
		System.out.println("c = "+c);
		
	}

}
