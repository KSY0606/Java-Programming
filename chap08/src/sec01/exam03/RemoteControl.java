package sec01.exam03;

public interface RemoteControl {
	//���
	int MAX_VOLUME = 10; // �պκп� public static final�� �����ص� interface������ �����ϴ�
	int MIN_VLOUME = 0;
	
	//�߻�޼ҵ� 
	/* public abstract�� �����Ǿ����� */ void turnOn();
	void turnOff();
	void setVolume(int volume);
}
