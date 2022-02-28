package sec02.exam04;

public class DriverExample {

	public static void main(String[] args) {
		
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);
				// 어떤 객체가 대입되냐에 따라 Driver의 run()의 실행결과가 달라진다
	}

}
