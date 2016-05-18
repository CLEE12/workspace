package samp06;
public class MessageBeanImpl implements MessageBean {
	private String name;
	public void setName(String name) {
		this.name = name;
	}
	public void sayHello() {
		try {	Thread.sleep(3000);
		} catch (InterruptedException e) {	}	
		System.out.println("안녕하세요 !! "+name);
	}	
}