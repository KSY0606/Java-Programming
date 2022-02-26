package sec01.exam06;

public interface RemoteControl {
	//상수
	int MAX_VOLUME = 10; // 앞부분에 public static final을 생략해도 interface에서는 가능하다
	int MIN_VOLUME = 0;
	
	//추상메소드 
	/* public abstract가 생략되어있음 */ void turnOn();
	void turnOff();
	void setVolume(int volume);
}
