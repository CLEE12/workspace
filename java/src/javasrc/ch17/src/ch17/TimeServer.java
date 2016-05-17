package ch17;
import java.net.*;
import java.io.*;

public class TimeServer {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(9001);
		try { 
			Socket client = ss.accept();
		    OutputStream os = client.getOutputStream();
		    ObjectOutputStream oos = new ObjectOutputStream(os);
		} catch(Exception e) {e.getMessage();}
	}

}
