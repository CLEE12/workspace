package samp02;
public class MesageBeanImpl implements MessageBean {
	private String name;	
	public void setName(String name) {
		this.name = name;
	}

	public void sayHello() {
		try{	Thread.sleep(3000);	}catch(Exception e){}
		System.out.println("안뇽!! "+name);		
	}
}