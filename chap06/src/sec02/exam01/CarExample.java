package sec02.exam01;

public class CarExample {

	public static void main(String[] args) {
		
		// ��ü ����
		Car myCar = new Car(); // Car ��ü �ȿ� ���ִ� �����͵��� �а� ���.
		
		//�ʵ尪 �б�
		System.out.println("����ȸ��: " + myCar.company);
		System.out.println("�𵨸�: " + myCar.model);
		System.out.println("����: " + myCar.color);
		System.out.println("�ְ�ӵ�: " + myCar.maxSpeed);
		System.out.println("����ӵ�: " + myCar.speed);  // CarŬ�������� �ʱⰪ�� �����ʾ� 0�� ��µ�
	
		//�ʵ尪 ����
		myCar.speed = 60;
		System.out.println("������ �ӵ�: " + myCar.speed);
	}

}
