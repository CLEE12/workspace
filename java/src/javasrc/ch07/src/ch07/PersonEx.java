package ch07;

public class PersonEx {
	public static void main(String[] args) {
		Student st1 = new Student("½Â±â",23,2);
		Student st2 = new Student("¼ÒÁö¼·",35,3);
		
		Teacher th1 = new Teacher("À¯Àç¼®",41,"Java");
		Teacher th2 = new Teacher("±è±¸¶ó",43,"JSP");
		
		Manager mg1 = new Manager("¼öÁö",23,"È«º¸");
		
		st1.printSt(); st2.printSt();
		th1.printTh(); th2.printTh();
		mg1.printMg();
	}

}
