package ch17;
import java.io.*;
import java.net.*;
import java.util.Scanner;
public class UrlConnectionEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("내용을 볼 주소는 ?");
		String str = sc.nextLine();
		InputStream is = null;
		InputStreamReader isr = null;
		URL url;
		BufferedReader br = null;
		String msg;
		try { url = new URL(str);
		URLConnection uc = url.openConnection();
		is = uc.getInputStream();
		isr = new InputStreamReader(is, "utf-8");
        br = new BufferedReader(isr);
        while((msg = br.readLine()) != null) {
        	System.out.println(msg);
        }
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}
}

