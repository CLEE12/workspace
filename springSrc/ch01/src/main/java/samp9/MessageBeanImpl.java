package samp9;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
public class MessageBeanImpl implements Message {
	private String name;
	private String greeting;
	// @Autowired  // byType
	@Resource   // byName
	private Outputter out;	
	public void setName(String name) {	this.name = name;	}
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
/*	public void setOut(Outputter out) {	this.out = out;	}*/
	public void sayHello() {
		String msg = name+"님 "+greeting;
		System.out.println(msg);
		if (out !=null)
			out.output(msg);
	}
}