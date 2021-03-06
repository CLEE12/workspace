package ch04;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Person {
	private String id; 
	private String name;
	public Person() { }
	public Person(String id, String name) {
		this.id = id;  
		this.name = name;
	}
	@Id
	@Column(name="id")
	public String getId() {	return id;	}
	public void setId(String id) {	this.id = id;	}
	public String getName() {	return name;	}
	public void setName(String name) {	this.name = name;	}	
}