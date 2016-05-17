package ch18;
import java.sql.*;
import java.util.Scanner;

public class Proc1Ex {
	public static void main(String[] args) {
		String driver = "oracle.jdvc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Scanner sc = new Scanner(System.in);
		System.out.println("�μ��ڵ� ? ");
		int deptno = Integer.parseInt(sc.nextLine());
		System.out.println("�μ��� ? ");
		String dname = sc.nextLine();
		System.out.println("�ٹ��� ? ");
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
			if(result > 0) System.out.println("�Է� ���� ����");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}sc.close();
	}

}
