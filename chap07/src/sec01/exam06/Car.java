package sec01.exam06;

public class Car {
	//�ʵ�
	public int speed;
	
	//������
	
	//�޼ҵ�
	
	public void speedUp() {
		speed += 1; // speed �ʵ忡 1�� �߰��Ѵ�
	}
	public final void stop() {  // final�� �Ἥ ������ �Ұ���
		System.out.println("���� ����");
		speed = 0;
	}
}
