package ch09;

public class String1 {
	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "java";
		String s3 = new String("java");
		if(s1==s2) System.out.println("s1�� s2�� ����");
		else System.out.println("s1�� s2�� �ٸ���");
		if(s1==s3) System.out.println("s1�� s3�� ����");
		else System.out.println("s1�� s3�� �ٸ���");
		if(s2==s3) System.out.println("s2�� s3�� ����");
		else System.out.println("s2�� s3�� �ٸ���");
		System.out.println("===============");
		if(s1.equals(s2)) System.out.println("s1�� s2�� ����");
		else System.out.println("s1�� s2�� �ٸ���");
		if(s1.equals(s3)) System.out.println("s1�� s3�� ����");
		else System.out.println("s1�� s3�� �ٸ���");
		if(s2.equals(s3)) System.out.println("s2�� s3�� ����");
		else System.out.println("s2�� s3�� �ٸ���");
		
		System.out.println("===============");
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		
		//equals�� ������ ������ �޸� �ּҰ� �޶� ���ٰ� ����.
		//if�� �޸� �ּҰ� ���ƾ� ���ٰ� ����.
	}

}
