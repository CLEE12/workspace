package ch18;
import java.sql.*;
import java.util.Scanner;
public class OraPrepare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�μ��ڵ� ?");
		String deptno = sc.nextLine();
		System.out.println("�μ��� ?");
		String dname = sc.nextLine();
		System.out.println("�ٹ��� ?");
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
			if (result > 0) System.out.println("�Է¼���");
			else System.out.println("�Է½��� �Ф�");
			pstmt.close();  conn.close();
		}catch(Exception e){ System.out.println(e.getMessage());}
		sc.close();
	}
}