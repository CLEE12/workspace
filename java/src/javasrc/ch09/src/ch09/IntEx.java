package ch09;

public class IntEx {
	public static void main(String[] args) {
		int s1 = 2;
		int s2 = 2;
		int s3 = 2; //int(�⺻��)�� = new ���°� �ȵ�.
		if(s1==s2) System.out.println("s1�� s2�� ����");
		else System.out.println("s1�� s2�� �ٸ���");
		if(s1==s3) System.out.println("s1�� s3�� ����");
		else System.out.println("s1�� s3�� �ٸ���");
		if(s2==s3) System.out.println("s2�� s3�� ����");
		else System.out.println("s2�� s3�� �ٸ���");
		
		/*if(s1.equals(s2)) System.out.println("s1�� s2�� ����");
		else System.out.println("s1�� s2�� �ٸ���");
		if(s1.equals(s3)) System.out.println("s1�� s3�� ����");
		else System.out.println("s1�� s3�� �ٸ���");
		if(s2.equals(s3)) System.out.println("s2�� s3�� ����");
		else System.out.println("s2�� s3�� �ٸ���");*/
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
	}

}
