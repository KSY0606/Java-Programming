package sec04.exam02;

public class Computer {
	//Field
	//Constructor
	//Method
	int sum1(int[] values) {
		int sum = 0; // sum변수에 0으로 초기화
	for(int i=0; i<values.length; i++) {
		sum += values[i]; // 요소의 값을 sum에 누적해줘야한다
	}
	return sum; // sum을 리턴값으로 지정
	}
	
	// 값의 목록으로 매개값을 받아 모두 더한뒤 결과값을 산출하는 메소드 생성
	int sum2(int ... values) {
		int sum = 0; 
		for(int i=0; i<values.length; i++) {
			sum += values[i]; 
		}
		return sum; 
	}
}
