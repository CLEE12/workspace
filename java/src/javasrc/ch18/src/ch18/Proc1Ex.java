package ch18;
import java.sql.*;
import java.util.Scanner;

public class Proc1Ex {
	public static void main(String[] args) {
		String driver = "oracle.jdvc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Scanner sc = new Scanner(System.in);
		System.out.println("부서코드 ? ");
		int deptno = Integer.parseInt(sc.nextLine());
		System.out.println("부서명 ? ");
		String dname = sc.nextLine();
		System.out.println("근무지 ? ");
		String loc = sc.nextLine();
		String sql = "{call insertTest(?,?,?)}";
		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url,"scott","tiger");
			CallableStatement cs = conn.prepareCall(sql);
			cs.setInt(1, deptno);
			cs.setString(2, dname);
			cs.setString(3, loc);
			int result = cs.executeUpdate();
			cs.close();
			conn.close();
			if(result > 0) System.out.println("입력 성공 ㅋㅋ");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}sc.close();
	}

}
