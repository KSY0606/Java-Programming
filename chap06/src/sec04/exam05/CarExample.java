package sec04.exam05;

public class CarExample {

	public static void main(String[] args) {
		// CarŬ������ �޼ҵ���� ����ϱ� ���� Car��ü ����
		Car myCar = new Car(); // Car��ü�� ����� myCar�� �����ϵ��� �ۼ�
		
		myCar.keyTurnOn();
		myCar.run();
		int speed = myCar.getspeed(); 
		// myCar.getspeed();�� ���൵ ������ ������� ������ �̿��� �ϱ�����(13����) 11����ó�� �ۼ����ش�
		System.out.println("���� �ӵ�: " + speed + "km/h");

	}

}
