package sec03.exam03;

public class CarExample {

	public static void main(String[] args) {
		
		Car car1 = new Car(); // Car Field의 기본값으로 저장되어 객체가 만들어짐
		System.out.println(car1.company);
		System.out.println(car1.model);
		System.out.println(car1.color);
		System.out.println(car1.maxSpeed);

		Car car2 = new Car("자가용");
		System.out.println(car2.company);
		System.out.println(car2.model);
		System.out.println(car2.color);
		System.out.println(car2.maxSpeed);
		
		Car car3 = new Car("자가용", "빨강");	// 자가용은 exam 03의 Car 19라인 model에, 빨강은 color에 대입
		System.out.println(car3.company);
		System.out.println(car3.model);
		System.out.println(car3.color);
		System.out.println(car3.maxSpeed);
		
		Car car4 = new Car("택시", "검정", 200);
		System.out.println(car4.company);
		System.out.println(car4.model);
		System.out.println(car4.color);
		System.out.println(car4.maxSpeed);
	}

}
