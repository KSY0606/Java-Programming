package sec02.exam03;

public class VehicleExample {

	public static void main(String[] args) {
		
		Vehicle vehicle = new Bus();  // ������ü ����
		
		// vehicle ������ ������ �ִ� �޼ҵ尡 1���� ������ run 1���� ȣ�� �� �� �ִ�
		vehicle.run();
		
		Bus bus = (Bus) vehicle; // ����Ÿ�Ժ�ȯ
		
		bus.checkFare();

	}

}
