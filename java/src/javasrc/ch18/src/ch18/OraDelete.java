package ch18;
import java.sql.*;
import java.util.Scanner;
public class OraDelete {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 부서코드는 ");
		String deptno=sc.nextLine();
		String driver="oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String sql = "delete from dept where deptno="+deptno;
		try{ Class.forName(driver);
			Connection conn=DriverManager.getConnection(url,
				"scott","tiger");
			Statement stmt = conn.createStatement();
			int result = stmt.executeUpdate(sql);
			if (result > 0 ) System.out.println("삭제 성공 ㅋㅋ");
			stmt.close();    conn.close();
		}catch(Exception e) {System.out.println(e.getMessage());}
	}
}