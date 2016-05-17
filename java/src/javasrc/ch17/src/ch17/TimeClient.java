package ch17;
import java.io.*;
import java.net.*;
import java.util.Date;
import java.util.Scanner;
public class TimeClient {
	public static void main(String[] args) throws UnknownHostException, IOException, ClassNotFoundException {
		Scanner sc = new Scanner(System.in);
		System.out.println("IP는 ?");
		String ip = sc.nextLine();
		System.out.println("포트는 ?");
		int port = sc.nextInt();
		Socket client = new Socket(ip, port);
		ObjectInputStream ois =
				new ObjectInputStream(client.getInputStream()); 
		System.out.println("현재 시간 : "+(Date)ois.readObject());
		client.close();  ois.close();
		sc.close();
	}
}