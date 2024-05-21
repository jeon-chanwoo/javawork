package _04_interface;

//인터페이스를 상속받을때는 임플리먼트를 사용한다.
//인터페이스는 다중상속이 가능하다.

public class Tv implements RemoteControl {
	private int volume;

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("tv를 켭니다");
	}
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("tv를 끕니다");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if (volume > RemoteControl.MAX_VOLUME)
			this.volume = RemoteControl.MAX_VOLUME;
		else if (volume < RemoteControl.MIN_VOLUME)
			this.volume = RemoteControl.MIN_VOLUME;
		else
			this.volume = volume;

		System.out.println("현재 볼륨 : " + this.volume);
	}

	/*public void setChannel(int channel) {
		// TODO Auto-generated method stub
		System.out.println("현재 볼륨 : "+volume);
	}*/

}
