package sec05.exam02;

public class CalculatorExample {

	public static void main(String[] args) {
		//원의 넓이
		double result1 = 10 * 10 * Calculator.pi; 
		int result2 = Calculator.plus(10, 5); // 정적메소드 이기때문에 클래스 이름으로 접근해야함
									//10은 x에 5는 y에 대입되어 두 수가 더해지고 15가 return된다
		int result3 = Calculator.minus(10, 5);
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);

	}

}
