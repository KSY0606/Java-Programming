package sec02.exam04;

public class Driver {
	public void drive(Vehicle vehicle) {
		
		// vehicle�� � ��ü�� ������ �𸣱� ������ bus��ü���� ���� Ȯ�����ش�
		if(vehicle instanceof Bus) {
			Bus bus = new Bus();
			bus.checkFare();
		}
		vehicle.run();
	}
}
