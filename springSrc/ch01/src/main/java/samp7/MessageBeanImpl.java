package samp7;
public class MessageBeanImpl implements MessageBean {
	private String name;
	private String greeting;
	public MessageBeanImpl(String name,String greeting) {
		this.name = name; 
		this.greeting = greeting;
	}
	public void sayHello() {
		System.out.println(name+"님 "+greeting);		
	}
}