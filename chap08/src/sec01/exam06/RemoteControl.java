package sec01.exam06;

public interface RemoteControl {
	//���
	int MAX_VOLUME = 10; // �պκп� public static final�� �����ص� interface������ �����ϴ�
	int MIN_VOLUME = 0;
	
	//�߻�޼ҵ� 
	/* public abstract�� �����Ǿ����� */ void turnOn();
	void turnOff();
	void setVolume(int volume);
}
