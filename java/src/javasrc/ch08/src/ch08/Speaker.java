package ch08;

public class Speaker implements Volume {
	public void volumeUp() {
		System.out.println("����Ŀ ������ �ø���.");
	}
	public void volumeDown() {
		System.out.println("����Ŀ ������ ������.");
	}
	public static void main(String[] args) {
		Volume[] vol = new Volume[3];
		vol[0] = new Radio();
		vol[1] = new TV();
		vol[2] = new Speaker();
		for(Volume v : vol) {
			v.volumeUp();
			v.volumeDown();
		}
	}
}
/* �Ϲ��� for��
for (i=0; i<vol.length; i++) {
	v[i].volumeUp();
	v[i].volumeDown();
*/