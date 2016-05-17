package ch10;
import java.sql.*;
import javax.sql.*;
import javax.naming.*;

public class MyProce {
	private int dno;
	private String dname;
	private String phone;
	private String position;

	public void setDno(int dno) {	this.dno = dno;	}
	public void setDname(String dname) {	this.dname = dname;	}
	public void setPhone(String phone) {	this.phone = phone;	}
	public void setPosition(String position) {	this.position = position;	}
	
	public int insert() {
		int result = 0;
		String sql = "{call(?,?,?,?)}";
		try { 
			Context ctx = new InitialContext();
			DataSource ds = (DataSource)ctx.lookup("java:comp/env/jdbc/MySql");
			Connection conn = ds.getConnection();
			CallableStatement cs = conn.prepareCall(sql);
			cs.setInt(1, dno);
			cs.setString(2, dname);
			cs.setString(3, phone);
			cs.setString(4, position);
			result=cs.executeUpdate();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} return result;
	}
	
}
