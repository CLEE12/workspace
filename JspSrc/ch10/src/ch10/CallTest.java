package ch10;
import java.sql.*;
import javax.sql.*;
import javax.naming.*;

public class CallTest {
	private int empno;
	public void setEmpno(int empno) {
		this.empno= empno;
	}
	public String call() {
		String pename = null;
		String sql = "{?call emp_ename(?)}";
		Connection conn = null;
		try { Context ctx = new InitialContext();
			DataSource ds = (DataSource)ctx.lookup("java:comp/env/jdbc/OracleDB");
			conn = ds.getConnection();
			CallableStatement cs = conn.prepareCall(sql);
			cs.registerOutParameter(1, Types.VARCHAR);
			cs.setInt(2, empno);
			cs.execute();
			pename=cs.getString(1);
			cs.close();
			conn.close();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return pename;
		
	}
}
