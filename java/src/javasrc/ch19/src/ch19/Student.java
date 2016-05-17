package ch19;
public class Student {
	private String name;	
	private int eng;	
	private int math;
	
	Student(String name,int eng,int math) {
		this.name = name;  this.eng = eng;  this.math = math;
	}
	
	public String getName() {		return name;	}
	public void setName(String name) {	this.name = name;	}
	public int getEng() {	return eng;	}
	public void setEng(int eng) {	this.eng = eng;	}
	public int getMath() {	return math;	}
	public void setMath(int math) {		this.math = math;	}	
}