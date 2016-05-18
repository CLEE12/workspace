package samp10;

import org.springframework.beans.factory.annotation.Autowired;

public class VechicleImpl implements Vechicle {
	private String name;
	private String vh;
	@Autowired
	private Outputter out;	
	public void setName(String name) {	this.name = name;	}
	public void setVh(String vh) {	this.vh = vh;	}
	// public void setOut(Outputter out) {	this.out = out;	}
	public void ride() {
		String msg = name+"은(는) "+vh+"을(를) 탄다";
		System.out.println(msg);
		if (out != null) out.output(msg);
	}
}