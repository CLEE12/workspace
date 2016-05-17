package ch11;
import java.sql.*;
import javax.sql.*;
import javax.naming.*;
public class MemberDao {
	private Connection getConnection() {
		Connection conn = null;
		try {
			Context ctx = new InitialContext();
			DataSource ds = (DataSource)
				ctx.lookup("java:comp/env/jdbc/OracleDB");
			conn = ds.getConnection();
		}catch(Exception e) {System.out.println(e.getMessage());}
		return conn;
	}
	public int insert(Member mem) throws SQLException{		
		int result = 0; Connection conn = null; 
		PreparedStatement pstmt = null;
		String sql = "insert into member1 values(?,?,?,sysdate)";
		try{
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mem.getId());
			pstmt.setString(2, mem.getPassword());
			pstmt.setString(3, mem.getName());
			result = pstmt.executeUpdate();
		} catch(Exception e) {System.out.println(e.getMessage());
		} finally {
			if (pstmt != null) pstmt.close();
			if (conn != null) conn.close();
		}	
		return result;
	}
	public int loginChk(String id,String password) throws SQLException{		
		int result = 0; Connection conn = null; 
		PreparedStatement pstmt = null; ResultSet rs = null;
		String sql = "select password from member1 where id=?";
		try{
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				String dbPass = rs.getString(1); //("password")
				if (dbPass.equals(password)) result = 1; // 일치
				else result = 0; // 암호가 다름
			} else result = -1;  // 데이터 읽기 실패
		} catch(Exception e) {System.out.println(e.getMessage());
		} finally {
			if (rs != null) rs.close();
			if (pstmt != null) pstmt.close();
			if (conn != null) conn.close();
		}	
		return result;
	}
	public String select(String id) throws SQLException{		
		String name = "";
		Connection conn = null; 
		PreparedStatement pstmt = null; ResultSet rs = null;
		String sql = "select name from member1 where id=?";
		try{
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				name = rs.getString(1);
			}
		} catch(Exception e) {System.out.println(e.getMessage());
		} finally {
			if (rs != null) rs.close();
			if (pstmt != null) pstmt.close();
			if (conn != null) conn.close();
		}	
		return name;
	}
}