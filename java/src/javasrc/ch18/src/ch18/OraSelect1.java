package ch18;
import java.sql.*;
import java.util.Scanner;
public class OraSelect1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���� �μ� �ڵ�� ?");
		String deptno=sc.nextLine();
		String driver="oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String sql = "select * from dept where deptno="+deptno;
		try { Class.forName(driver);
			Connection conn=
				DriverManager.getConnection(url,"scott","tiger");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				String dname=rs.getString("dname");  // 2
				String loc = rs.getString(3);  // 3 -> "loc"
				                     // �÷�����, �÷���
				System.out.println("�μ��ڵ� : "+deptno);
				System.out.println("�μ��� : "+dname);
				System.out.println("�ٹ��� : "+loc);
				rs.close();
			} else System.out.println("�����Ͱ� �����ϴ�");
			stmt.close();  conn.close();
		} catch (Exception e) {System.out.println(e.getMessage());}
		sc.close();
	}
}