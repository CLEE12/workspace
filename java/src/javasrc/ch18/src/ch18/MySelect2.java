package ch18;
import java.sql.*;
import java.util.Scanner;
public class MySelect2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("보고 싶은 사원 코드는 ?");
		String pno=sc.nextLine();
		String driver="com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://127.0.0.1:3306/test";
		String sql="select pname,format(pay,0),dname from "
		 +"personal p, division d where p.dno=d.dno and pno="+pno;
		try { Class.forName(driver);
			Connection conn=
				DriverManager.getConnection(url,"root","mysql");
			Statement stmt=conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				String pname=rs.getString("pname");
				String pay  =rs.getString(2);
				String dname=rs.getString(3);
				System.out.println("사번 : "+pno);
				System.out.println("이름 : "+pname);
				System.out.println("급여 : "+pay);
				System.out.println("부서명 : "+dname);
				rs.close();
			}else System.out.println("데이터가 없네");
			stmt.close();  conn.close();
		}catch(Exception e){System.out.println(e.getMessage());}
		sc.close();
	}
}