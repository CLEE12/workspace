package sample16.model;
import java.util.Date;
public class Member {
	private int id;
	private String email;
	private String password;
	private String name;
	private Date registerDate;
	
	public Member(String email,String password,String name,
			Date registerDate) {
		this.email = email; this.password = password;
		this.name  = name; this.registerDate = registerDate;
	}
	public int getId() {	return id;	}
	public void setId(int id) {	this.id = id;	}
	public String getEmail() {	return email;	}
	public void setEmail(String email) {	this.email = email;	}
	public String getPassword() {	return password;	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {	return name;	}
	public void setName(String name) {	this.name = name;	}
	public Date getRegisterDate() {	return registerDate;	}
	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
	public int changePassword(String oldPassword, String newPassword) {
		int chk = 0;
		if (password.equals(oldPassword)) {
			password = newPassword;
			chk = 1;
		} else {
			System.out.println("패스워드가 달라서 수정할 수 없습니다");
		}
		return chk;
	}
}