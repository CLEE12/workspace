package ch17;
import java.io.*;
import java.net.*;
import java.util.Date;
import java.util.Scanner;
public class TimeClient {
	public static void main(String[] args) throws UnknownHostException, IOException, ClassNotFoundException {
		Scanner sc = new Scanner(System.in);
		System.out.println("IP�� ?");
		String ip = sc.nextLine();
		System.out.println("��Ʈ�� ?");
		int port = sc.nextInt();
		Socket client = new Socket(ip, port);
		ObjectInputStream ois =
				new ObjectInputStream(client.getInputStream()); 
		System.out.println("���� �ð� : "+(Date)ois.readObject());
		client.close();  ois.close();
		sc.close();
	}
}