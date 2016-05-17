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
		//���δ� �� 
		int sum2 = sumAll(list, n -> n % 2 == 0); 
		//¦�� �� 
		int sum3 = sumAll(list, n -> n > 5); 
		//5����ū�� �� //���� ��� 
		list.forEach(System.out::println); 
		System.out.println("��� �� �� : " + sum1); 
		System.out.println("¦�� �� : " + sum2); 
		System.out.println("5����ū���� : " + sum3);
	}
}