package sec04.exam02;

public class ComputerExample {

	public static void main(String[] args) {
		
		Computer myCom = new Computer();	// Computer타입에 myCom 변수를 선언하고 new연산자로 Computer 생성자를 호출해서 객체생성 
		
		int[] values1 = {1, 2, 3}; // 값을 가지고있는 배열 생성
		
		int result1 = myCom.sum1(values1); // sum1은 배열의 요소를 전부 더한 결과값을 int값을 주게됨
		System.out.println("result1: " + result1);

		
		//배열객체를 먼저 만들지않고 sum1을 호출할때 배열객체 생성
		int result2 = myCom.sum1(new int[] {1, 2, 3, 4, 5});
		System.out.println("reslut2: " + result2);
		
		int result3 = myCom.sum2(1, 2, 3); // 1,2,3을 다 더해 결과값을 result3에 저장됨
		System.out.println("result3: " + result3);
		
		int result4 = myCom.sum2(1, 2, 3, 4, 5);
		System.out.println("result4: " + result4);
	}

}
