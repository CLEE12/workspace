package ch06;

class Card {
	int num;
	boolean isKwang;
	Card(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
		
	}
	public String toString() {
		String result;
		if(isKwang)
			result = " _______\n|      |\\ \n| "+num+"    ||\n"
					+ "|    ��  ||\n|______||\n \\=====\\|";
			//result = "ī��[��ȣ : "+num+",��]";
		else if(num >=10) result = " _______\n|      |\\ \n"
				+ "| "+num+"   ||\n|      ||\n|______||\n \\=====\\|";
		else result = " _______\n|      |\\ \n| "+num+"    ||\n"
				+ "|      ||\n|______||\n \\=====\\|";
		return result;
	}
}
/*
 _______
|      |\
| 1    ||
|    ��  ||
|______||
\=====\|*/
