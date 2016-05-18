package samp03;
public class VechicleImpl implements Vechicle {
	private String name;	
	public void setName(String name) {
		this.name = name;
	}
	public void ride() {
		try {	Thread.sleep(3000);
		} catch (InterruptedException e) {	}
		System.out.println(name+"은 자전거를 탄다");		
	}
}