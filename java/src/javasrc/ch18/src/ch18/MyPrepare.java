package ch18;
import java.sql.*;
import java.util.Scanner;
public class MyPrepare {
	public static void main(String[] args) {
		String driver="com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://127.0.0.1:3306/test";
		Scanner sc = new Scanner(System.in);
		System.out.println("�μ��ڵ� ?");
		int dno = Integer.parseInt(sc.nextLine());
		System.out.println("�μ��� ?");
		String dname = sc.nextLine();
		System.out.println("��ȭ��ȣ ?");
		String phone = sc.nextLine();
		System.out.println("�ٹ��� ?");
		String position = sc.nextLine();
		String sql="insert into division values(?,?,?,?)";
		try {
			Class.forName(driver);
			Connection conn = 
				DriverManager.getConnection(url,"root","mysql");
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dno);     pstmt.setString(2, dname);
			pstmt.setString(3,phone); pstmt.setString(4,position);
			int result = pstmt.executeUpdate();
			if (result > 0 ) System.out.println("�Է� ���� ����");
			pstmt.close();   conn.close();
		}catch(Exception e) {System.out.println(e.getMessage());}
		sc.close();
	}
}