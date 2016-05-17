package ch18;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
public class EmpDao {
	private static EmpDao instance = new EmpDao();
	private EmpDao() {}
	public static EmpDao getInstance() {
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
	public List<Emp> selectList(int deptno) {
		Connection conn = null; PreparedStatement pstmt = null;
		ResultSet  rs = null;
		ArrayList<Emp> list = new ArrayList<>();
		String sql  = "select * from emp ";
		String sql2 = " where deptno=?";
		try { conn  = getConnection();		
			if (deptno!=0) { 
				sql +=sql2; 
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, deptno);
			} else { pstmt = conn.prepareStatement(sql); }
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Emp e = new Emp();
				e.setEmpno(rs.getInt("empno"));
				e.setEname(rs.getString("ename"));
				e.setJob(rs.getString("job"));
				e.setMgr(rs.getInt("mgr"));
				e.setHiredate(rs.getDate("hiredate"));
				e.setSal(rs.getInt("sal"));
				e.setComm(rs.getInt("comm"));
				e.setDeptno(rs.getInt("deptno"));
				list.add(e);
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
	public List<Emp1> selectList1(int deptno) {
		Connection conn = null; PreparedStatement pstmt = null;
		ResultSet  rs = null;
		List<Emp1> list = new ArrayList<>();
		String sql  = "select * from emp ";
		String sql2 = " where deptno=?";
		try { conn  = getConnection();		
			if (deptno!=0) { 
				sql +=sql2; 
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, deptno);
			} else { pstmt = conn.prepareStatement(sql); }
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Emp1 e = new Emp1();
				e.setEmpno(rs.getInt("empno")+"");
				e.setEname(rs.getString("ename"));
				e.setJob(rs.getString("job"));
				e.setMgr(rs.getInt("mgr")+"");
				e.setHiredate(rs.getDate("hiredate")+"");
				e.setSal(rs.getInt("sal")+"");
				e.setComm(rs.getInt("comm")+"");
				e.setDeptno(rs.getInt("deptno")+"");
				list.add(e);
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