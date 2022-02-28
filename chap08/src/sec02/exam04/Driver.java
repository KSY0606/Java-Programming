package sec02.exam04;

public class Driver {
	public void drive(Vehicle vehicle) {
		
		// vehicle에 어떤 객체가 들어올지 모르기 떄문에 bus객체인지 먼저 확인해준다
		if(vehicle instanceof Bus) {
			Bus bus = new Bus();
			bus.checkFare();
		}
		vehicle.run();
	}
}
