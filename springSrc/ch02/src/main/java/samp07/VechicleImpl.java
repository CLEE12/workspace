package samp07;
public class VechicleImpl implements Vechicle {
	private String name;	
	public void setName(String name) {
		this.name = name;
	}
	public void ride() {
		try {		Thread.sleep(1000);
		} catch (InterruptedException e) {	}
		System.out.println(name+"은(는) 자동차를 탄다");		
	}
}
