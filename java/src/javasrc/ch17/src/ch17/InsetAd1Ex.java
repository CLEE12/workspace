package ch17;
import java.net.*;
import java.util.Scanner;
public class InsetAd1Ex {
	public static void main(String[] args) throws UnknownHostException {
		Scanner sc = new Scanner(System.in);
		System.out.println("url�Է�");
	    String url = sc.nextLine();
	    InetAddress ia1 = InetAddress.getByName(url);
	    System.out.println("address : "+ia1.getHostAddress());
	    System.out.println("name : "+ia1.getHostName());
	}
}
