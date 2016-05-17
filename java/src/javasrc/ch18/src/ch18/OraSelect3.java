package ch18;
import java.sql.*;
public class OraSelect3 {
	public static void main(String[] args) {
		String driver="oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String sql = "select * from dept";
		try { Class.forName(driver);
			Connection conn=
				DriverManager.getConnection(url,"scott","tiger");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			System.out.println("�μ�����");
			System.out.println("�μ��ڵ�\t�μ���\t\t�ٹ���");
			System.out.println("-----------------------------------");
			if (rs.next()) {
				do { int deptno  = rs.getInt("deptno");   // 1
					String dname = rs.getString("dname"); // 2
					String loc   = rs.getString(3);       // loc
					if (dname.length()>7)
					 System.out.println(deptno+"\t"+dname+"\t"+loc);
					else
					 System.out.println(deptno+"\t"+dname+"\t\t"+loc);
				} while(rs.next());
				rs.close();
			} else System.out.println("������ �����ϴ�");
			stmt.close();  conn.close();
		}catch(Exception e){ System.out.println(e.getMessage()); }
	}
}