package sec01.exam05;

public class SmartTelevisionExample {

	public static void main(String[] args) {
		
		SmartTelevision tv = new SmartTelevision();
		
		RemoteControl rc = tv; // tv가 RemoteControl 인터페이스를 구현하고있기때문에 대입이 가능함
		//Remotecontrol에 정의된 메소드 3개가 사용가능함
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(3);
	
		Searchable searchable = tv;
		searchable.search("www.naver.com");

	}

}
