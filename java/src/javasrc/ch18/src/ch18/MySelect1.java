package ch18;
import java.sql.*;
import java.util.Scanner;
public class MySelect1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���� �μ� �ڵ�� ?");
		String dno = sc.nextLine();
		String driver="com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://127.0.0.1:3306/test";
		String sql="select * from division where dno="+dno;
		try { Class.forName(driver);
			Connection conn = 
				DriverManager.getConnection(url,"root","mysql");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()){
				String dname=rs.getString(2);
				String phone=rs.getString(3);
				String position=rs.getString(4);
				System.out.println("�μ��ڵ� : "+dno);
				System.out.println("�μ��� : "+dname);
				System.out.println("��ȭ��ȣ : "+phone);
				System.out.println("�ٹ��� : "+position);
				rs.close();
			}else System.out.println("� �ֳ�");
			stmt.close();  conn.close();
		}catch(Exception e) {System.out.println(e.getMessage());}
		sc.close();
	}
}