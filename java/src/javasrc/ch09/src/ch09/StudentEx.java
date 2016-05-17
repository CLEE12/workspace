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
		return "이름 : "+name+", 나이 : "+age+", 학년 : "+grade;
	}
}
public class StudentEx {
	public static void main(String[] args) {
		Student s1 = new Student("설현", 21, 1);
		Student s2 = new Student("설현", 22, 2);
		Student s3 = new Student("승기", 25, 2);
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		
		if(s1==s2) System.out.println("s1과 s2는 같다");
		else System.out.println("s1과 s2는 다른다");
		if(s1==s3) System.out.println("s1과 s3는 같다");
		else System.out.println("s1과 s3는 다른다");
		if(s2==s3) System.out.println("s2과 s3는 같다");
		else System.out.println("s2과 s3는 다른다");
		//대소문자 구분, 문자가 같으면 같다고 인식
		System.out.println("===============");
		
		if(s1.name.equals(s2.name)) System.out.println("s1과 s2는 같다");
		else System.out.println("s1과 s2는 다른다");
		if(s1.name.equals(s3.name)) System.out.println("s1과 s3는 같다");
		else System.out.println("s1과 s3는 다른다");
		if(s2.name.equals(s3.name)) System.out.println("s2과 s3는 같다");
		else System.out.println("s2과 s3는 다른다");
		//문자가 달라도 메모리 주소가 같으면 같다.
		System.out.println("===============");
		/*
		if(s1.equalsIgnoreCase(s2)) System.out.println("s1과 s2는 같다");
		else System.out.println("s1과 s2는 다른다");
		if(s1.equalsIgnoreCase(s3)) System.out.println("s1과 s3는 같다");
		else System.out.println("s1과 s3는 다른다");
		if(s2.equalsIgnoreCase(s3)) System.out.println("s2과 s3는 같다");
		else System.out.println("s2과 s3는 다른다");
		//equalsIgnoreCase를 사용하면 대소문자 구분하지 않고 비교함.
*/		System.out.println("===============");
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
	}

}
