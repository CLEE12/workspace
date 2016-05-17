package ch08;
public class SeperateEx {
	public static void main(String[] args) {
		SeperateVolume sv1 = 
				new SeperateVolume("111","ÁË¿Í¹ú","µµ½ºÅä¿½½ºÅ°");
		SeperateVolume sv2 = 
				new SeperateVolume("112","´ëÁö","ÆŞ¹÷");
		sv1.checkOut("¼³Çö", "20160112 ");
		sv1.checkIn();
		sv2.checkOut("ÇÏ´Ï", "20160101 ");
		sv2.checkIn();
	}	
}
