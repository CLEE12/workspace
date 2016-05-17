package dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.sql.*;

import model.PdsItem;

import javax.naming.*;
public class PdsItemDao {
	private static PdsItemDao instance = new PdsItemDao();
	private PdsItemDao() {}
	public static PdsItemDao getInstance() {
		return instance;
	}
	private Connection getConnection() {
		Connection conn = null;
		try { Context ctx = new InitialContext();
			DataSource ds = (DataSource)
				ctx.lookup("java:comp/env/jdbc/OracleDB");
			conn = ds.getConnection();
		}catch(Exception e) {System.out.println(e.getMessage());}
		return conn;
	}
	public int insert(PdsItem pi) {
		int result = 0,id = 0;  Connection conn = null; 
		PreparedStatement pstmt = null;  ResultSet rs = null;
		String sql  = "insert into pds_item values (?,?,?,?)";
		String sql2 = "select nvl(max(id),0)+1 from pds_item";
		try { conn  = getConnection();
			pstmt = conn.prepareStatement(sql2);
			rs = pstmt.executeQuery();
			if (rs.next()) id = rs.getInt(1);
			pi.setId(id);
			pstmt.close();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, pi.getId());
			pstmt.setString(2, pi.getFileName());
			pstmt.setInt(3, pi.getFileSize());
			pstmt.setString(4, pi.getDescription());
			result = pstmt.executeUpdate();
		}catch(Exception e) { System.out.println(e.getMessage());
		}finally {
			try {if (rs != null) rs.close();
				 if (pstmt != null) pstmt.close();
				 if (conn != null) conn.close();
			}catch(Exception e) {}
		}
		return result;
	}
	public List<PdsItem> selectAll() {
		Connection conn = null; 
		List<PdsItem> list = new ArrayList<>();
		PreparedStatement pstmt = null;  ResultSet rs = null;
		String sql  = "select * from pds_item order by id desc";
		try { conn  = getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				PdsItem pi = new PdsItem();
				pi.setId(rs.getInt("id"));
				pi.setFileName(rs.getString("fileName"));
				pi.setFileSize(rs.getInt("fileSize"));
				pi.setDescription(rs.getString("description"));
				list.add(pi);
			}			
		}catch(Exception e) { System.out.println(e.getMessage());
		}finally {
			try {if (rs != null) rs.close();
				 if (pstmt != null) pstmt.close();
				 if (conn != null) conn.close();
			}catch(Exception e) {}
		}
		return list;
	}
}