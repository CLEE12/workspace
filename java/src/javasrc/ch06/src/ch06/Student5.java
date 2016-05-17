package ch06;

public class Student5 {
	private String name;
	private int age;
	private int grade;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	void print() {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Grade : "+grade);
		System.out.println("=================");
	}

}
