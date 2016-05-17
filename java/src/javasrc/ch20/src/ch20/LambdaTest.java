package ch20;
import java.util.*;
public class LambdaTest {
	public static void printAll(List<Developer> list) { 
		list.forEach(System.out::println); 
	} 
	public static void printDevOrderBySkill(List<Developer> list){
		Collections.sort(list, ( Developer d1, Developer d2) -> 
		d1.getSkill().compareTo(d2.getSkill())); 
		list.forEach(System.out::println); 
	} 
	public static int sumAll(List<Integer> numbers, 
			Predicate<Integer> p) { 
		int total = 0; 
		for(int number : numbers) {
			if (p.test(number)) {total += number;} } 
		return total; 
	}
	public static void main(String[] args) { 
		List<Developer> dev = new ArrayList<>(); 
		dev.add(new Developer("JAVA", 10)); 
		dev.add(new Developer("ORACLE", 15)); 
		dev.add(new Developer("C#", 7)); 
		dev.add(new Developer("ANDROID", 5)); 
		printAll(dev); 
		System.out.println("------------------"); 
		printDevOrderBySkill(dev); 
		System.out.println("---------------"); 
		List<Integer> list = Arrays.asList(1,8,3,9,4,7); 
		int sum1 = sumAll(list, n -> true); 
		//전부다 합 
		int sum2 = sumAll(list, n -> n % 2 == 0); 
		//짝수 합 
		int sum3 = sumAll(list, n -> n > 5); 
		//5보다큰수 합 //전부 출력 
		list.forEach(System.out::println); 
		System.out.println("모든 수 합 : " + sum1); 
		System.out.println("짝수 합 : " + sum2); 
		System.out.println("5보다큰수합 : " + sum3);
	}
}