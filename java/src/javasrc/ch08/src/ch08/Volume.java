package ch08;

public interface Volume {
	void volumeUp();
	void volumeDown();
}
class Radio implements Volume {
	public void volumeUp() {
		System.out.println("���� ������ �ø���.");
	}
	public void volumeDown() {
		System.out.println("���� ������ ������.");
	}
}
class TV implements Volume {
	public void volumeUp() {
		System.out.println("TV ������ �ø���.");
	}
	public void volumeDown() {
		System.out.println("TV ������ ������.");
	}
}
