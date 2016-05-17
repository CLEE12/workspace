package ch06;

public class PersonEx {
	public static void main(String[] args) {
		Student5 st1 = new Student5();
		st1.setName("길동"); st1.setAge(21); st1.setGrade(2);
		Student5 st2 = new Student5();
		st2.setName("수지"); st2.setAge(23); st2.setGrade(1);
		
		Teacher t1 = new Teacher();
		t1.setName("소지섭"); t1.setAge(27); t1.setSubject("Java");
		Teacher t2 = new Teacher();
		t2.setName("장동건"); t2.setAge(41); t2.setSubject("C++");
		
		Manager m1 = new Manager();
		m1.setName("장혁"); m1.setAge(50); m1.setPart("화장실청소");
		Manager m2 = new Manager();
		m2.setName("쯔위"); m2.setAge(20); m2.setPart("복도청소");
		
		 st1.print();
		 st2.print();
		 t1.print();
		 t2.print();
		 m1.print();
		 m2.print();
		 
		
	}

}
