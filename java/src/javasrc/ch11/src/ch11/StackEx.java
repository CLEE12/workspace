package ch11;
import java.util.Stack;
public class StackEx {
	public static void main(String[] args) {
		String[] pet = {"±Àº¬ÀÌ","¾Ö¹ú·¹","°í½¿µµÄ¡","°­¾ÆÁö"};
		Stack<String> sk = new Stack<>(); 
		for(int i =0; i < pet.length;i++) {
			// sk.push(pet[i]);
			sk.add(pet[i]);
		}
		
		while(!sk.isEmpty()) {
			System.out.println(sk.pop());
		}
	}
}