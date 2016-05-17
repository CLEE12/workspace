package ch08;

public class EmployeeEx {
	public static void main(String[] args) {
		Employee[] emp = new Employee[5];
		emp[0] = new SalaryMan("수지", 200000);
		emp[1] = new SalaryMan("효린", 100000);
		emp[2] = new SalaryMan("IU", 360000);
		emp[3] = new HourlyMan("박명수", 3, 1500);
		emp[4] = new HourlyMan("김구라", 13, 2500);
	
		
		for (int i=0; i<emp.length; i++) {
			int pay = emp[i].calPay();
			int bonus = emp[i].calIncentive();
			System.out.println(emp[i].name+", 급여 : "+pay+", 상여 : "+bonus);
		}
	}

}
