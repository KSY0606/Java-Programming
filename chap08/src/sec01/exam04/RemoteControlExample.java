package sec01.exam04;

public class RemoteControlExample {

	public static void main(String[] args) {
		
		RemoteControl rc; // ���� rc ����
		rc = new Television(); // ��ü����       Television ��ü ���� Audio�� �������ָ� Audio�� �޼ҵ尡 ����ȴ�
			// Television�� ���Ե� �޼ҵ���� �����
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		

	}

}
