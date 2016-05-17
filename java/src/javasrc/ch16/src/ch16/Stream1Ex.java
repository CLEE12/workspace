package ch16;
import java.io.*;
import java.util.Arrays;
public class Stream1Ex {
	public static void main(String[] args) {
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;
		ByteArrayInputStream bai = new ByteArrayInputStream(inSrc);
		ByteArrayOutputStream bao = new ByteArrayOutputStream();
		int data = 0;
		
		while((data=bai.read())!= -1) {
			bao.write(data);
		}
		outSrc = bao.toByteArray();
		System.out.println("inSrc = "+Arrays.toString(inSrc));
		System.out.println("outSrc = "+Arrays.toString(outSrc));
		
	}
}
