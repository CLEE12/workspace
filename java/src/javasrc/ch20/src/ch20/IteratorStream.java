package ch20;
import java.util.*;
import java.util.stream.Stream;
public class IteratorStream {
	public static void main(String[] args) {
		List<String> list=Arrays.asList("ȫ�浿","����","�ϴ�",
			"���ϴ�");
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());			
		}
		System.out.println("=================");
		Stream st = list.stream();
		st.forEach(n->System.out.println(n));
	}
}