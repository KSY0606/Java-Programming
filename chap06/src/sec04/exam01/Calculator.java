package sec04.exam01;

public class Calculator {
	//Field
	//Constructor
	//Method
	void powerOn() { // 메소드 선언
		System.out.println("전원을 켭니다.");
	}
	
	int plus(int x, int y) {   // 외부에서 2개의 값을 받아 덧셈을 함
		int result = x + y;
		return result; // reslut가 최종값이라는 뜻으로 return
	}
	
	double divide(int x, int y) {     // 외부에서 2개의 값을 받아 나눗셈을 함
		double result =  (double)x / (double) y;
		return result;
	}
	
		void powerOff() { // 결과값, 외부에서 받아야하는 값이 없음
			System.out.println("전원을 끕니다.");
	}
}
