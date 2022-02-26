package sec01.exam06;

public class Audio implements RemoteControl {

	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) { // 매개값으로 받은 volume이 RemoteControl.MAX_VOLUME 보다 크다면..
			this.volume = RemoteControl.MAX_VOLUME;  // RemoteControl.MAX_VOLUME 을 강제적으로 대입시켜줌
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
		this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨 : " + this.volume);
	}

}
