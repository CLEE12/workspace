package samp6;
public class VechicleImpl implements Vechicle {
	private String name;
	private String vh;	
	public void setName(String name) {
		this.name = name;
	}
	public void setVh(String vh) {
		this.vh = vh;
	}
	public void ride() {
		System.out.println(name+"은(는) "+vh+"을 탄다");		
	}
}