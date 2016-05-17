package ch18;
import java.sql.*;
import java.util.Scanner;
public class MyInsert {
	public static void main(String[] args) {
		String driver="com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://127.0.0.1:3306/test";
		Scanner sc=new Scanner(System.in);
		System.out.println("부서코드 ?");
		String dno = sc.nextLine();
		System.out.println("부서명 ?");
		String dname = sc.nextLine();
		System.out.println("전화번호 ?");
		String phone = sc.nextLine();
		System.out.println("근무지 ?");
		String position = sc.nextLine();
		String sql=String.format(
			"insert into division values(%s,'%s','%s','%s')",
			dno,dname,phone,position);
		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(
				url,"root","mysql");
			Statement stmt = conn.createStatement();
			int result = stmt.executeUpdate(sql);
			if (result > 0) System.out.println("입력 성공");
			stmt.close();   conn.close();
		}catch(Exception e) { System.out.println(e.getMessage());}
		sc.close();
	}
}