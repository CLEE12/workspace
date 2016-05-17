package ch20;
import java.util.*;
import java.util.stream.Stream;
public class ParStreamEx {
	public static void main(String[] args) {
		List<String> list = 
			Arrays.asList("��Ǹ�","����","�ϴ�","�̰Ǹ�");
		Stream<String> st = list.stream();
		st.forEach(ParStreamEx::print);
		System.out.println("===============");
		Stream<String> st2 = list.parallelStream();
		st2.forEach(ParStreamEx::print);
	}
	static void print(String name) {
		System.out.println(name+" : "+
			Thread.currentThread().getName());
	}
}