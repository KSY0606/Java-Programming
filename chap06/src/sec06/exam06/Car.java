package sec06.exam06;

public class Car {
	//Field
	private int speed;
	private boolean stop;

	//Method
	public int getSpeed() { // �ʵ�Ÿ���� ����Ÿ���� ��(5���� int-9���� int), get+�ʵ��̸� 
		return speed;
	}
	public void setSpeed(int speed) {
		if(speed < 0) { // speed�� ������ ���� 0������ �ǰ� ����
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}
		this.speed = speed;
	}
	public boolean isStop() { // boolean�� ��� getter�޼ҵ�� is�� ������
		return stop;
	}
	public void setStop(boolean stop) { // �ʵ�� ������ Ÿ���� �Ű������� �����ϰ� �ʵ忡 �����Ѵ�
		this.stop = stop;
			speed = 0;
	}
}
