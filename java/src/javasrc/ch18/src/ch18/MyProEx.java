package ch18;
import java.sql.*;
import java.util.Scanner;

public class MyProEx {
	public static void main(String[] args) {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://127.0.0.1:3306/test";
		// division_insert 이용하여 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("부서코드 ? ");
		int dno = Integer.parseInt(sc.nextLine());
		System.out.println("부서명 ? ");
		String dname = sc.nextLine();
		System.out.println("전화번호 ? ");
		String phone = sc.nextLine();
		System.out.println("근무지 ? ");
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
			if(result > 0) System.out.println("입력 성공 ㅋㅋ");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}sc.close();
	}
}
