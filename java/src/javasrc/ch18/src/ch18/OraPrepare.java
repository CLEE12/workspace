package ch18;
import java.sql.*;
import java.util.Scanner;
public class OraPrepare {
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
//		String sql = String.format(	
//				"insert into dept values(%s,'%s','%s')",
//				deptno,dname,loc);
		String sql = "insert into dept values(?,?,?)";			
		try{ Class.forName(driver);
			Connection conn = DriverManager.getConnection(url,
				"scott", "tiger");
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, deptno);
			pstmt.setString(2, dname);
			pstmt.setString(3, loc);
			int result = pstmt.executeUpdate();
			if (result > 0) System.out.println("입력성공");
			else System.out.println("입력실패 ㅠㅠ");
			pstmt.close();  conn.close();
		}catch(Exception e){ System.out.println(e.getMessage());}
		sc.close();
	}
}