package ch07;

public class Engine {
	String type;
	int cc;
	
	Engine(String type, int cc) {
		this.type = type;
		this.cc   = cc;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) { 
		this.cc = cc;
	}
	
	public void print() {
		System.out.println("Engine      : "+type);
		System.out.println("HorsePower  : "+cc);
	}
}
