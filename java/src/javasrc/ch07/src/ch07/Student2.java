package ch07;
public class Student2 extends Person2 {
	private int grade;
	Student2(String name, int age, int grade) {
		super(name,age); this.grade = grade; 
	}
	public int getGrade() {	return grade;	}
	public void setGrade(int grade) {	this.grade = grade;	}
	// 자식메소드 부모보다 접근지정자 같거나 넓어야 한다
	void print() {
		super.print();
		System.out.println("학년 : "+grade);
	}
}
class Teacher2 extends Person2 {
	private String subject;
	Teacher2(String name, int age, String subject) {
		super(name,age); this.subject = subject;
	}
	public String getSubject() {	return subject;	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	void print() {
		super.print();
		System.out.println("과목 : "+subject);
	}
}
class Manager2 extends Person2 {
	private String part;
	Manager2(String name, int age, String part) {
		super(name,age);  this.part=part; 
	}
	public String getPart() {	return part;	}
	public void setPart(String part) {	this.part = part;	}
	void print() {
		super.print();
		System.out.println("담당 : "+part);
	}
}