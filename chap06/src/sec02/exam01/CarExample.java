package sec02.exam01;

public class CarExample {

	public static void main(String[] args) {
		
		// 객체 생성
		Car myCar = new Car(); // Car 객체 안에 들어가있는 데이터들을 읽고 출력.
		
		//필드값 읽기
		System.out.println("제작회사: " + myCar.company);
		System.out.println("모델명: " + myCar.model);
		System.out.println("색깔: " + myCar.color);
		System.out.println("최고속도: " + myCar.maxSpeed);
		System.out.println("현재속도: " + myCar.speed);  // Car클래스에서 초기값을 주지않아 0이 출력됨
	
		//필드값 변경
		myCar.speed = 60;
		System.out.println("수정된 속도: " + myCar.speed);
	}

}
