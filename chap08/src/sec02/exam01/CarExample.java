package sec02.exam01;

public class CarExample {

	public static void main(String[] args) {
		
		Car mycar = new Car(); // 객체생성
		mycar.run();  // 메소드 호출
		
		mycar.frontLeftTire = new KumhoTire();
		mycar.frontRightTire = new KumhoTire();

		mycar.run();
	}

}
