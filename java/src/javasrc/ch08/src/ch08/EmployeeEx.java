package ch08;

public class EmployeeEx {
	public static void main(String[] args) {
		Employee[] emp = new Employee[5];
		emp[0] = new SalaryMan("����", 200000);
		emp[1] = new SalaryMan("ȿ��", 100000);
		emp[2] = new SalaryMan("IU", 360000);
		emp[3] = new HourlyMan("�ڸ��", 3, 1500);
		emp[4] = new HourlyMan("�豸��", 13, 2500);
	
		
		for (int i=0; i<emp.length; i++) {
			int pay = emp[i].calPay();
			int bonus = emp[i].calIncentive();
			System.out.println(emp[i].name+", �޿� : "+pay+", �� : "+bonus);
		}
	}

}
