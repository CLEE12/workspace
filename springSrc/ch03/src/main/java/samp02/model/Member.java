package samp02.model;
import java.sql.Date;
public class Member {
	private String id;			private String email;
	private String password;	private String name;
	private Date regdate;
	
	public Member() {}
	public Member(String id,String email,String password,
			String name ) {
		this.id = id; 			  this.email=email;
		this.password = password; this.name = name;
	}
	public int changePassword(String oldPassword,String newPassword) {
		int result = 0;
		if (password.equals(oldPassword)) {
			password = newPassword;
			result = 1;
		} else {
			System.out.println("암호가 달라서 수정할 수 없습니다");
		}
		return result;
	}
	public String getId() {	return id;	}
	public void setId(String id) {	this.id = id;	}
	public String getEmail() {	return email;	}
	public void setEmail(String email) { this.email = email; }
	public String getPassword() { return password;	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {	return name; }
	public void setName(String name) { 	this.name = name;	}
	public Date getRegdate() { 	return regdate;	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	
}
