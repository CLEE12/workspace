package ch16;
import java.io.*;
import java.io.Serializable;
public class BookInfo extends GoodInfo implements Serializable {
	String writer;  int page;
	BookInfo(String code,String name,int price,String writer,
			int page) {
		super(code, name, price);
		this.writer = writer; this.page = page;
	}
	private void writeObject(ObjectOutputStream oos) throws IOException{
		oos.writeUTF(code); oos.writeUTF(name); oos.writeInt(price); 
		// oos.writeUTF(writer);	oos.writeInt(page);
		oos.defaultWriteObject();
	}
	private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException{
		code=ois.readUTF(); name=ois.readUTF(); price=ois.readInt(); 
		// writer=ois.readUTF();	page=ois.readInt();
		ois.defaultReadObject();
	}
}