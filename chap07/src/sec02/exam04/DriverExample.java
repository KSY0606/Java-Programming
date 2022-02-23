package sec02.exam04;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Vehicle vehicle = new Vehicle();
		
		driver.drive(vehicle);
		
		Bus bus = new Bus(); // bus 객체 생성
		
		driver.drive(bus); // 메소드 호출

		Taxi taxi = new Taxi();
		
		driver.drive(taxi);
	}

}
