package sec01.exam05;

public class SmartTelevision implements RemoteControl, Searchable{ // RemoteControl과 Searchable를 모두 구현해서 만듦

	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다");
		
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
		System.out.println("현재 TV볼륨 : " + this.volume);
}
	@Override
	public void search(String url) {	// 외부로부터 url을 받아온다
		System.out.println(url + "을 검색합니다.");
		
	}
}