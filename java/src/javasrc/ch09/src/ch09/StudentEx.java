package ch09;
class Student {
	String name;
	int age;
	int grade;
	Student(String name, int age, int grade) {
		this.name=name;
		this.age=age;
		this.grade=grade;
	}
	public String toString() {
		return "�̸� : "+name+", ���� : "+age+", �г� : "+grade;
	}
}
public class StudentEx {
	public static void main(String[] args) {
		Student s1 = new Student("����", 21, 1);
		Student s2 = new Student("����", 22, 2);
		Student s3 = new Student("�±�", 25, 2);
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		
		if(s1==s2) System.out.println("s1�� s2�� ����");
		else System.out.println("s1�� s2�� �ٸ���");
		if(s1==s3) System.out.println("s1�� s3�� ����");
		else System.out.println("s1�� s3�� �ٸ���");
		if(s2==s3) System.out.println("s2�� s3�� ����");
		else System.out.println("s2�� s3�� �ٸ���");
		//��ҹ��� ����, ���ڰ� ������ ���ٰ� �ν�
		System.out.println("===============");
		
		if(s1.name.equals(s2.name)) System.out.println("s1�� s2�� ����");
		else System.out.println("s1�� s2�� �ٸ���");
		if(s1.name.equals(s3.name)) System.out.println("s1�� s3�� ����");
		else System.out.println("s1�� s3�� �ٸ���");
		if(s2.name.equals(s3.name)) System.out.println("s2�� s3�� ����");
		else System.out.println("s2�� s3�� �ٸ���");
		//���ڰ� �޶� �޸� �ּҰ� ������ ����.
		System.out.println("===============");
		/*
		if(s1.equalsIgnoreCase(s2)) System.out.println("s1�� s2�� ����");
		else System.out.println("s1�� s2�� �ٸ���");
		if(s1.equalsIgnoreCase(s3)) System.out.println("s1�� s3�� ����");
		else System.out.println("s1�� s3�� �ٸ���");
		if(s2.equalsIgnoreCase(s3)) System.out.println("s2�� s3�� ����");
		else System.out.println("s2�� s3�� �ٸ���");
		//equalsIgnoreCase�� ����ϸ� ��ҹ��� �������� �ʰ� ����.
*/		System.out.println("===============");
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
	}

}
