package sec02.exam03;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i=1; i<=5; i++) {
			int problemLocation = car.run(); // 리터값을 받도록 작성
			switch(problemLocation) {
				case 1: // Tire 필드에 HanKookTire 대입  타입변환이 생김
					System.out.println("앞왼쪽 HanKookTire로 교체");
					car.frontLeftTire = new HanKookTire("앞왼쪽",15); 
					break;
				case 2:
					System.out.println("앞오른쪽 KumhoTire로 교체");
					car.frontLeftTire = new KumhoTire("앞오른쪽",13); 
					break;
				case 3:
					System.out.println("뒤왼쪽 HanKookTire로 교체");
					car.frontLeftTire = new HanKookTire("뒤왼쪽",14); 
					break;
				case 4:
					System.out.println("뒤오른쪽 KumhoTire로 교체");
					car.frontLeftTire = new KumhoTire("뒤오른쪽",17); 
					break;
			}
			
			System.out.println("---------------------------");
		}

	}

}
