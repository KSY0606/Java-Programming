package sec04.exam04;

public class Calculator {
	//Field
	//Constructor
	//Method
	int plus(int x, int y) { // int 타입의 값을 리턴, 메소드이름:plus, 외부로 부터 int값 x,y를 선언
		int result =  + y;
		return result; // 덧셈의 결과를 리턴값으로 지정
	}
	
	double avg(int x, int y) { // double타입의 값을 리턴,메소드이름: avg
		// double sum = x + y;도 사용되지만 7라인에 plus메소드를 선언했기때문에 호출해서 sum에 저장.
		double sum = plus(x, y); 
		double result = sum / 2;
		return result;
	}
	//return값이 없는경우
	void execute() {
		double result = avg(7, 10); // 7은 x에 대입  10은 y에 대입됨
		println("실행결과: " + result);
	}
	
	void println(String message) {
		System.out.println(message);
	}
}
