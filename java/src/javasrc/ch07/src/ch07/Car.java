package ch07;

public class Car {
	String manuf;
	String model;
	Engine eg; //Engine class�� ������������ ����� �� �ִ�.
	Car(String manuf, String model, Engine eg) {
		this.manuf = manuf;
		this.model = model;
		this.eg    = eg;
	}
	public String getManuf() {
		return manuf;
	}
	public void setManuf(String manuf) {
		this.manuf = manuf;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Engine getEg() {
		return eg;
	}
	public void setEg(Engine eg) {
		this.eg = eg;
	}
	public void print() {
		System.out.println("--------------------------");
		System.out.println("Manufacture : "+manuf);
		System.out.println("Model       : "+model);
		eg.print();
	}

}
