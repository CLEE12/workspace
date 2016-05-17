package ch07;

import java.util.HashMap;
import java.util.Map;

public class Thermometer {
	Map<String, Double> th = new HashMap<>();
	public void setTh(String loc, double value) {
		th.put(loc, value);
	}
	public double getTh(String loc) {
		return th.get(loc);
	}
	public double getFarenheit(String loc) {
		return th.get(loc)*1.8+32;
	}
	public String info() {
		return "온도계";
	}
}
