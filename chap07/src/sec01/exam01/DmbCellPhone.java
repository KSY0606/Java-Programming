package sec01.exam01;

public class DmbCellPhone extends CellPhone{ // CellPhone�� ������ �ִ� �ʵ�� �޼ҵ带 �����ް� ��
	//�ʵ�
	int channel; // ä�� ������ ������ �� �ְ� ����
	
	//������
	//�ܺο��� ������, ����, ä�������� �����ϱ� ���� ����
	DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	//�޼ҵ�    CellPhone�� �������ִ� �޼ҵ�6���� �����޾ұ⶧���� �������ִ� ����
	void turnOnDmb() {
		System.out.println("ä��" + channel + "�� DMB ��� ������ �����մϴ�.");
	}
	void changeChannelDmb(int channle) {
		this.channel = channel;
		System.out.println("ä��" + channel + "������ �ٲߴϴ�.");
	}
	void turnOffDmb() {
		System.out.println("DMB ��� ������ ����ϴ�.");
	}
	
}
