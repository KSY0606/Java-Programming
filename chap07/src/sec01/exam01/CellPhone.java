package sec01.exam01;

public class CellPhone {
	//Field
	String model;  // private�� ����ϰ� �Ǹ�  ��Ӵ�󿡼� ���ܵ�
	String color;
	
	//constructor
	
	//Method			�޼ҵ嵵 ���������� private�� ����ϰ� �Ǹ�  ��Ӵ�󿡼� ���ܵ�
	void powerOn() { System.out.println("������ ��ϴ�."); }
	void powerOff() { System.out.println("������ ���ϴ�."); }
	void bell() { System.out.println("���� �︳�ϴ�."); }
	void sendVoice(String message) { System.out.println("�ڱ�: " + message); }
	void receiveVoice(String message) { System.out.println("����: " + message); }
	void hangUp() { System.out.println("��ȭ�� �����ϴ�."); }
	
}
