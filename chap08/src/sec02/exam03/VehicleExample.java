package sec02.exam03;

public class VehicleExample {

	public static void main(String[] args) {
		
		Vehicle vehicle = new Bus();  // 구현객체 대입
		
		// vehicle 변수가 가지고 있는 메소드가 1개기 떄문에 run 1개만 호출 할 수 있다
		vehicle.run();
		
		Bus bus = (Bus) vehicle; // 강제타입변환
		
		bus.checkFare();

	}

}
