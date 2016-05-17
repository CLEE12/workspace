package ch18;
import java.sql.*;
import java.util.Scanner;
public class OraSelect2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���� ��� �ڵ�� ?");
		String empno=sc.nextLine();
		String driver="oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String sql="select ename,to_char(sal,'9,999'),dname from "
		 +"emp e,dept d where e.deptno=d.deptno and empno="+empno;
		try { Class.forName(driver);
			Connection conn=DriverManager.getConnection(url,"scott","tiger");
			Statement stmt=conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				String ename=rs.getString(1);
				String sal=rs.getString(2);
				String dname=rs.getString("dname");
				System.out.println("��� : "+empno);
				System.out.println("�̸� : "+ename);
				System.out.println("�޿� : "+sal);
				System.out.println("�μ��� : "+dname);
				rs.close();
			} else System.out.println("����");
			stmt.close();  conn.close();
		} catch(Exception e){System.out.println(e.getMessage());}
		sc.close();
	}
}