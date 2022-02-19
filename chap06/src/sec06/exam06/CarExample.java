package sec06.exam06;

public class CarExample {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		myCar.setSpeed(60); //  Car클래스의 필드인 speed에 저장된다
		System.out.println("현재속도: " + myCar.getSpeed());

		if(!myCar.isStop()) { // !를 붙여주면서 현재 움직이냐고 묻게됨
			myCar.setStop(true);
		}
		System.out.println("현재속도: " + myCar.getSpeed());
	}

}
