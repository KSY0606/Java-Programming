package sec01.exam06;

public class MyClass {

	//�ʵ�
	RemoteControl rc = new Television();  
	
	//������
	MyClass(){
		
	}
	         //�Ű������� ���� rc�� �ʵ��� rc�� ����
	MyClass(RemoteControl rc) {
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}
	//�޼ҵ�
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);

	}
	
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(5);
	}
}  // �������̽�(RemoteControl)��  �ʵ���Ÿ��(6����), ������(13����)�� �Ű������� �Ű�����Ÿ��(26����)���� ���ú����� Ÿ��(20����)���� ���ȴ�
