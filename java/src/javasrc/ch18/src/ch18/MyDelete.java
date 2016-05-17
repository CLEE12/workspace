package ch18;
import java.sql.*;
import java.util.Scanner;
public class MyDelete {
	public static void main(String[] args) {
		String driver="com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://127.0.0.1:3306/test";
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 부서코드는 ?");
		String dno = sc.nextLine();
		String sql = "delete from division where dno="+dno;
		try {
			Class.forName(driver);
			Connection conn=
				DriverManager.getConnection(url,"root","mysql");
			Statement stmt = conn.createStatement();
			int result = stmt.executeUpdate(sql);
			if (result >0) System.out.println("삭제 성공");
			stmt.close();  conn.close();
		}catch(Exception e){ System.out.println(e.getMessage());}
		sc.close();
	}
}