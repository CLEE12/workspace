package samp9;
import java.io.FileWriter;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class FileOutputter implements Outputter {
	private String fileName="tt1.txt";
/*	public void setFileName(String fileName) {
		this.fileName = fileName;
	}*/
	public void output(String msg) {
		FileWriter fw;
		try {
			fw = new FileWriter(fileName);
			fw.write(msg);
			fw.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}		
	}
}