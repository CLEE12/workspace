package ch18;
import java.sql.*;
public class MyConnEx {
	public static void main(String[] args) {
		String driver="com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://127.0.0.1:3306/test";
		                    //      ip       port db��
		try {
			Class.forName(driver);
			Connection conn=
				DriverManager.getConnection(url,"root","mysql");
			if(conn != null) System.out.println("���Ἲ��");
			conn.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}