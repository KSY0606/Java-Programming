package sec04.exam05;

public class CarExample {

	public static void main(String[] args) {
		// Car클래스의 메소드들을 사용하기 위해 Car객체 생성
		Car myCar = new Car(); // Car객체를 만들고 myCar가 참조하도록 작성
		
		myCar.keyTurnOn();
		myCar.run();
		int speed = myCar.getspeed(); 
		// myCar.getspeed();를 써줘도 되지만 결과값을 가지고 이용을 하기위해(13라인) 11라인처럼 작성해준다
		System.out.println("현재 속도: " + speed + "km/h");

	}

}
