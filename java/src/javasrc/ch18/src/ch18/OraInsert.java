package ch18;
import java.sql.*;
import java.util.Scanner;
public class OraInsert {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("부서코드 ?");
		String deptno = sc.nextLine();
		System.out.println("부서명 ?");
		String dname = sc.nextLine();
		System.out.println("근무지 ?");
		String loc = sc.nextLine();
		String driver="oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
//		String sql = "insert into dept values("+deptno+
//			",'"+dname+"','"+loc+"')";
		String sql = String.format(	
			"insert into dept values(%s,'%s','%s')",
			deptno,dname,loc);
		try{ Class.forName(driver);
			Connection conn = DriverManager.getConnection(url,
				"scott", "tiger");
			Statement stmt = conn.createStatement();
			int result = stmt.executeUpdate(sql);
			if (result > 0) System.out.println("입력성공");
			else System.out.println("입력싷패 ㅠㅠ");
			stmt.close();  conn.close();
		}catch(Exception e){ System.out.println(e.getMessage());}
		sc.close();
	}
}