package ch18;
import java.sql.*;
import java.util.Scanner;
public class MyUpdate {
	public static void main(String[] args) {
		String driver="com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://127.0.0.1:3306/test";
		Scanner sc = new Scanner(System.in);
		System.out.println("수정할 부서코드는 ?");
		String dno = sc.nextLine();
		System.out.println("부서명 ?");
		String dname = sc.nextLine();
		System.out.println("전화번호 ?");
		String phone = sc.nextLine();
		System.out.println("근무지 ?");
		String position = sc.nextLine();
		String sql = String.format(	"update division set dname='%s',"
			+ "phone='%s',position='%s' where dno=%s",
			dname,phone,position,dno);
		try{ 
			Class.forName(driver);
			Connection conn = 
				DriverManager.getConnection(url,"root","mysql");
			Statement stmt  = conn.createStatement();
			int result = stmt.executeUpdate(sql);
			if (result > 0 ) System.out.println("수정 성공 ㅋㅋ");
			stmt.close();    conn.close();
		}catch(Exception e){System.out.println(e.getMessage()); }
		sc.close();
	}
}