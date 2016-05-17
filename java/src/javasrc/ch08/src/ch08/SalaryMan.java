package ch08;

public class SalaryMan extends Employee {
	int annualMoney;
	SalaryMan(String name, int annualMoney) {
		super(name); 
		this.annualMoney = annualMoney;
	}
	@Override
	public int calPay() {
		// TODO Auto-generated method stub
		return annualMoney/12;
		
	}
}
class HourlyMan extends Employee {
	int workHour, amtPerHour;
	HourlyMan(String name, int workHour, int amtPerHour) {
		super(name); 
		this.workHour = workHour; 
		this.amtPerHour = amtPerHour;
	}
	public int calPay() {
		return workHour * amtPerHour;
	}
}
