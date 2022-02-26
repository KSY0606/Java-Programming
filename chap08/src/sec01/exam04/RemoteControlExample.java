package sec01.exam04;

public class RemoteControlExample {

	public static void main(String[] args) {
		
		RemoteControl rc; // 변수 rc 선언
		rc = new Television(); // 객체생성       Television 객체 말고도 Audio를 대입해주면 Audio의 메소드가 실행된다
			// Television에 대입된 메소드들이 실행됨
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		

	}

}
