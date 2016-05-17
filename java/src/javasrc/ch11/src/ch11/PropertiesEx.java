package ch11;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesEx {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties pro = new Properties();
		String path = PropertiesEx.class
				.getResource("database.properties").getPath();
		path = URLDecoder.decode(path, "utf-8"); //throw∏¶ «ÿ¡‡æﬂ «‘.§µ§≤
		pro.load(new FileReader(path));
		String driver = pro.getProperty("driver");
		String url = pro.getProperty("url");
		String username = pro.getProperty("username");
		String password = pro.getProperty("password");
		System.out.println("Driver    : "+driver);
		System.out.println("URL       : "+url);
		System.out.println("User Name : "+username);
		System.out.println("Password  : "+password);
	}
}
