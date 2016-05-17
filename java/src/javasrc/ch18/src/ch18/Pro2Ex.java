package ch18;
import java.sql.*;
import java.util.Scanner;

public class Pro2Ex {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Scanner sc = new Scanner(System.in);
		System.out.println("알고 싶은 직원의 사번은 ?");
		int empno = sc.nextInt();
		String sql = "{call empInfo(?,?,?)}";
		try { 
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url,"scott","tigher");
			CallableStatement cs = conn.prepareCall(sql);
			cs.setInt(1, empno);
			cs.registerOutParameter(2, java.sql.Types.VARCHAR);
			cs.registerOutParameter(3, java.sql.Types.INTEGER);
			cs.execute();
			System.out.println("이름 : "+cs.getString(2));
			System.out.println("급여 : "+cs.getInt(3));
		} catch (Exception e) {System.out.println(e.getMessage());
		}
		sc.close();
	}
}
