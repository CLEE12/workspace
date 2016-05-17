package ch18;
import java.sql.*;
import java.util.Scanner;
public class MySelect1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("보고 싶은 부서 코드는 ?");
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
				System.out.println("부서코드 : "+dno);
				System.out.println("부서명 : "+dname);
				System.out.println("전화번호 : "+phone);
				System.out.println("근무지 : "+position);
				rs.close();
			}else System.out.println("놀구 있네");
			stmt.close();  conn.close();
		}catch(Exception e) {System.out.println(e.getMessage());}
		sc.close();
	}
}