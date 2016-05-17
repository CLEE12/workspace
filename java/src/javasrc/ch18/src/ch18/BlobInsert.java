package ch18;
import java.io.*;
import java.sql.*;

public class BlobInsert {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String sql = "insert into test values('kk', ?)";
		File file = new File("java.jpg");
		int length = (int)file.length();
		try {
			InputStream is = new FileInputStream(file);
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, "scott", "tiger");
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setBinaryStream(1, is, length); // 이게 포인트!
			int result = pstmt.executeUpdate();
			if (result > 0) System.out.println("입력 성공");
			is.close();
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
