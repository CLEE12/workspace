package ch08;
public class SeperateEx {
	public static void main(String[] args) {
		SeperateVolume sv1 = 
				new SeperateVolume("111","�˿͹�","�����俽��Ű");
		SeperateVolume sv2 = 
				new SeperateVolume("112","����","�޹�");
		sv1.checkOut("����", "20160112 ");
		sv1.checkIn();
		sv2.checkOut("�ϴ�", "20160101 ");
		sv2.checkIn();
	}	
}
