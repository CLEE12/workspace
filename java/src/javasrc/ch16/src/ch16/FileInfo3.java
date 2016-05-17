package ch16;
import java.io.*;
import java.util.Scanner;

public class FileInfo3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		String fileName = sc.nextLine();
		File file = new File(fileName);
		
		
		
		sc.close();
	}

}
