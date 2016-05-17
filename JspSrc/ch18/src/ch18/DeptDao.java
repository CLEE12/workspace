package ch18;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.sql.*;
import javax.naming.*;
public class DeptDao {
	private static DeptDao instance = new DeptDao();
	private DeptDao() {}
	public static DeptDao getInstance() {
		return instance;
	}
	private Connection getConnection() {
		Connection conn = null;
		try { Context ctx = new InitialContext();
			DataSource ds = (DataSource)
				ctx.lookup("java:comp/env/jdbc/OracleDB");
			conn = ds.getConnection();
		}catch(Exception e) { System.out.println(e.getMessage());} 
		return conn;
	}
	public List<Dept> selectList(int deptno) {
		Connection conn = null; PreparedStatement pstmt = null;
		ResultSet  rs = null;
		List<Dept> list = new ArrayList<>();
		String sql  = "select * from dept ";
		String sql2 = " where deptno=?";
		try { conn  = getConnection();		
			if (deptno!=0) { 
				sql +=sql2; 
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, deptno);
			} else { pstmt = conn.prepareStatement(sql); }
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Dept d = new Dept();
				d.setDeptno(rs.getInt(1));
				d.setDname(rs.getString(2));
				d.setLoc(rs.getString(3));
				list.add(d);
			}
		}catch(Exception e) { System.out.println(e.getMessage());
		}finally {
			try{
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			}catch(Exception e) {}
		}
		return list;
	}
}