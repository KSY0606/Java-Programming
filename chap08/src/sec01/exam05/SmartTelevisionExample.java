package sec01.exam05;

public class SmartTelevisionExample {

	public static void main(String[] args) {
		
		SmartTelevision tv = new SmartTelevision();
		
		RemoteControl rc = tv; // tv�� RemoteControl �������̽��� �����ϰ��ֱ⶧���� ������ ������
		//Remotecontrol�� ���ǵ� �޼ҵ� 3���� ��밡����
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(3);
	
		Searchable searchable = tv;
		searchable.search("www.naver.com");

	}

}
