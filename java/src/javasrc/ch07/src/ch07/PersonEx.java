package ch07;

public class PersonEx {
	public static void main(String[] args) {
		Student st1 = new Student("�±�",23,2);
		Student st2 = new Student("������",35,3);
		
		Teacher th1 = new Teacher("���缮",41,"Java");
		Teacher th2 = new Teacher("�豸��",43,"JSP");
		
		Manager mg1 = new Manager("����",23,"ȫ��");
		
		st1.printSt(); st2.printSt();
		th1.printTh(); th2.printTh();
		mg1.printMg();
	}

}
