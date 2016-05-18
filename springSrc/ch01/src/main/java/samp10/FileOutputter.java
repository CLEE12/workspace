package samp10;
import java.io.FileWriter;

import org.springframework.stereotype.Component;
@Component
public class FileOutputter implements Outputter {
	private String fileName="aa.txt";	
/*	public void setFileName(String fileName) {
		this.fileName = fileName;
	}*/
	public void output(String msg) {
		try {
			FileWriter fw = new FileWriter(fileName);
			fw.write(msg);
			fw.close();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}