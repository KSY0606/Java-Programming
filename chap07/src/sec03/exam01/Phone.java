package sec03.exam01;

public abstract class Phone {  // �߻�Ŭ������ ����� �ֱ����� abstract 
	//�ʵ�  
	public String owner; // ������ ������ ����Ǵ� owner�ʵ� 
	
	//������
	public Phone(String owner) {  //�ܺηκ��� owner������ �Է¹޾� ����
	this.owner = owner;
	}
	
	//�޼ҵ�
	public void turnOn() {
		System.out.println("�� ������ �մϴ�.");
		
	}
	
	public void turnOff() {
		System.out.println("�� ������ ���ϴ�.");
	}
}
