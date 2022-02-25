package sec03.exam01;

public class PhoneExample {

	public static void main(String[] args) {
		
		// Phone phone = new Phone(); 는 Phone이 추상클래스이기때문에 직접적으로 객체 생성이 안됨

		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
		
	}

}
