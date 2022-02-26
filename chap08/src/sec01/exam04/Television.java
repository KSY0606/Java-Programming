package sec01.exam04;

public class Television implements RemoteControl {

	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) { // �Ű������� ���� volume�� RemoteControl.MAX_VOLUME ���� ũ�ٸ�..
			this.volume = RemoteControl.MAX_VOLUME;  // RemoteControl.MAX_VOLUME �� ���������� ���Խ�����
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
		this.volume = volume;
		}
		System.out.println("���� TV ���� : " + this.volume);
	}

}
