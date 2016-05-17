package ch07;

public class Student extends Person {
	private int grade;
	Student(String name, int age, int grade) {
		this.grade = grade; setName(name); setAge(age);
		//this.name  = name;
		//name은 private이여서 setName을 해줘야 함.
	}
	public int getGrade() { return grade; }
	public void setGrade(int grade) {this.grade = grade; }
	void printSt() {
		print();
		System.out.println("학년 : "+grade);
	}
}
class Teacher extends Person {
	private String subject;
	Teacher(String name, int age, String subject) {
		this.subject = subject; setName(name); setAge(age);
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	void printTh() {
		print();
		System.out.println("과목 : "+subject);
	}
}
class Manager extends Person {
	private String part;
	public String getPart() {
		return part;
	}
	public void setPart(String part) {
		this.part = part;
	}
	Manager(String name, int age, String part) {
		this.part = part; setName(name); setAge(age);
	}
	void printMg() {
		print();
		System.out.println("담당 : "+part);
	}
}