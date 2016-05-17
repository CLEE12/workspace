package ch08;

public interface Volume {
	void volumeUp();
	void volumeDown();
}
class Radio implements Volume {
	public void volumeUp() {
		System.out.println("라디오 볼륨을 올린다.");
	}
	public void volumeDown() {
		System.out.println("라디오 볼륨을 내린다.");
	}
}
class TV implements Volume {
	public void volumeUp() {
		System.out.println("TV 볼륨을 올린다.");
	}
	public void volumeDown() {
		System.out.println("TV 볼륨을 내린다.");
	}
}
