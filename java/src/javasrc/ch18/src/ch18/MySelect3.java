package ch18;
import java.sql.*;
public class MySelect3 {
	public static void main(String[] args) {
		String driver="com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://127.0.0.1:3306/test";
		String sql = "select * from division";
		System.out.println("�μ��ڵ�\t�μ���\t��ȭ��ȣ\t\t�ٹ���");
		try{ Class.forName(driver);
			Connection conn=
				DriverManager.getConnection(url,"root","mysql");
			Statement stmt = conn.createStatement();
			ResultSet rs   = stmt.executeQuery(sql);
			if(rs.next()) {
				do {int dno=rs.getInt(1); 
					String dname=rs.getString(2);
					String phone=rs.getString(3);
					String position = rs.getString(4);
					System.out.println(dno+"\t"+dname+"\t"+phone+
						"\t"+position);
				} while(rs.next());
				rs.close();
			} else System.out.println("�����Ͱ� �����ϴ�");
			stmt.close(); conn.close();
		}catch(Exception e){System.out.println(e.getMessage()); }
	}
}