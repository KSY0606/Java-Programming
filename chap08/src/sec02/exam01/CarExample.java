package sec02.exam01;

public class CarExample {

	public static void main(String[] args) {
		
		Car mycar = new Car(); // ��ü����
		mycar.run();  // �޼ҵ� ȣ��
		
		mycar.frontLeftTire = new KumhoTire();
		mycar.frontRightTire = new KumhoTire();

		mycar.run();
	}

}
