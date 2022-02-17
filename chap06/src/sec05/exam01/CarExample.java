package sec05.exam01;

public class CarExample {

	public static void main(String[] args) {
		
		// Car클래스가 가지고있는 인스턴스필드,메소드를 사용하기 위해 객체를 생성해줘야함
		
		Car myCar = new Car("포르쉐");
		Car yourCar = new Car("벤츠");
		
		myCar.run();
		yourCar.run();
	}

}
