package _04_interface;

public interface RemoteControl {
	public static final int MAX_VOLUME = 100;
	//public static final 생략가능
	int MIN_VOLUME = 0;
	
	//인터페이스는 추상메소드만 들어갈 수 있다.
	public abstract void turnOn();
	void turnOff();
	void setVolume(int volume);
	//void setChannel(int channel);
}
