package ch20;
public interface Predicate<T> {
	boolean test(T t);
}
class Developer {
	private String skill;	private int carri;
	public Developer(String skill, int carri) {
		this.skill = skill;
		this.carri = carri;
	}
	public String getSkill() {	return skill;	}
	public void setSkill(String skill) {	this.skill = skill;	}
	public int getCarri() {		return new Integer(carri);	}
	public void setCarri(int carri) {	this.carri = carri;	}

	public String toString() {
		return getSkill() + "::" + getCarri();
	}
}