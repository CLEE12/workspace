package ch18;
import java.sql.*;
public class OracleConnEx {
	public static void main(String[] args) {
		String driver="oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		                              // ip       port sid
		try {
			Class.forName(driver);
			Connection conn=
				DriverManager.getConnection(url,"scott","tiger");
			if (conn != null) System.out.println("연결 성공");
			conn.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}