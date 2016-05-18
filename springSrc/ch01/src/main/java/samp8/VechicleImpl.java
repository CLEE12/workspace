package samp8;
public class VechicleImpl implements Vechicle {
	private String name;
	private String vh;
	VechicleImpl(String name,String vh) {
		this.name = name;
		this.vh = vh;
	}
	public void ride() {
		System.out.println(name+"은(는) "+vh+"을(를) 탄다");		
	}
}