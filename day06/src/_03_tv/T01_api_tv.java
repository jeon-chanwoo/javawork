package _03_tv;

public class T01_api_tv {
	String company = "LG";
	String model = "울트라 Full HD초 광각 tv";
	int inch = 34;
	int vol; // 기본값 : 0
	int channel = 1;
	boolean power;// 기본값 :false

	void power() {
		power = !power;
	}
	
	int channelUp() {
		channel++;
		return channel;
	}
	
	int channelDown() {
		channel--;
		return channel;
	}
	
	int vol(int volIn) {
		vol=volIn;
		return vol;
		
	}
}
