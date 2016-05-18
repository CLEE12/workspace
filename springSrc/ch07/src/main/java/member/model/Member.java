package member.model;
import java.sql.Date;
public class Member {
	private String id;		private String pass;
	private String pass2;
	public String getPass2() {
		return pass2;
	}
	public void setPass2(String pass2) {
		this.pass2 = pass2;
	}
	private String name;	private String tel;
	private String addr;	private Date regDate;
	
	public String getId() {	return id;	}
	public void setId(String id) {	this.id = id;	}
	public String getPass() {	return pass;	}
	public void setPass(String pass) {	this.pass = pass;	}
	public String getName() {	return name;	}
	public void setName(String name) {	this.name = name;	}
	public String getTel() {	return tel;	}
	public void setTel(String tel) {	this.tel = tel;	}
	public String getAddr() {	return addr;	}
	public void setAddr(String addr) {	this.addr = addr;	}
	public Date getRegDate() {	return regDate;	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}	
}