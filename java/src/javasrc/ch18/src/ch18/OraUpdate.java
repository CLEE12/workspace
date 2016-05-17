package ch18;
import java.sql.*;
import java.util.Scanner;
public class OraUpdate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("수정할 부서코드 ?");
		String deptno = sc.nextLine();
		System.out.println("부서명 ?");
		String dname = sc.nextLine();
		System.out.println("근무지 ?");
		String loc = sc.nextLine();
		String driver="oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String sql = String.format(	
			"update dept set dname='%s',loc='%s' where deptno=%s",
			dname,loc,deptno);
		try{ Class.forName(driver);
			Connection conn = DriverManager.getConnection(url,
				"scott", "tiger");
			Statement stmt = conn.createStatement();
			int result = stmt.executeUpdate(sql);
			if (result > 0) System.out.println("수정성공 ㅋㅋ");
			stmt.close();  conn.close();
		}catch(Exception e){ System.out.println(e.getMessage());}
		sc.close();
	}
}