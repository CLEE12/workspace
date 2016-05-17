package ch20;
import java.util.*;
import java.util.stream.Stream;
public class LamdaEx {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
			new Student("길동",78),new Student("설현",95) );
		Stream<Student> st = list.stream();
		st.forEach(s-> {
			String name = s.getName();
			int score = s.getScore();
			System.out.println(name + " : " +score);
		});
	}
}