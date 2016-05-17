package ch18;
import java.sql.*;
import java.util.Scanner;

public class MyProEx {
	public static void main(String[] args) {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://127.0.0.1:3306/test";
		// division_insert �̿��Ͽ� �Է�
		Scanner sc = new Scanner(System.in);
		System.out.println("�μ��ڵ� ? ");
		int dno = Integer.parseInt(sc.nextLine());
		System.out.println("�μ��� ? ");
		String dname = sc.nextLine();
		System.out.println("��ȭ��ȣ ? ");
		String phone = sc.nextLine();
		System.out.println("�ٹ��� ? ");
		String position = sc.nextLine();
		String sql = "{call division_insert(?,?,?,?)}";
		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url,"root","mysql");
			CallableStatement cs = conn.prepareCall(sql);
			cs.setInt(1, dno);
			cs.setString(2, dname);
			cs.setString(3, phone);
			cs.setString(4, position);
			int result = cs.executeUpdate();
			cs.close();
			conn.close();
			if(result > 0) System.out.println("�Է� ���� ����");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}sc.close();
	}
}
