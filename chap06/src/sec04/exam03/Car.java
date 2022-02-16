package sec04.exam03;

public class Car {
	//Field
	int gas;
	
	//Constructor
	
	//Method
	void setGas(int gas) {
		this.gas = gas; // gas는 배개변수 this.gas는 Field, 외부로부터 받은 gas를 this.gas(Field)에 저장하는 역할의 메소드
	}
	
	boolean isLeftGas() { // gas가 남아있다면 true 없다면 false를 리턴값으로 하기위해 boolean으로 리턴타입을 정함
		if(gas == 0) { // gas가 0이라면 17라인 리턴문이 실행되어 메소드가 종료되어 20라인은 실행되지않음
			System.out.println("gas가 없습니다.");
			return false;
		} 
		System.out.println("gas가 있습니다.");
		return true; // gas가 0이 아니라면 15라인은 false가 되기 때문에 true가 실행된다.
		}
	
	void run() {
		while(true) {
			if(gas > 0) {// gas가 0초과 일때 실행됨
				System.out.println("달립니다.(gas 잔량: " + gas + ")");
				gas -= 1; // gas--;도 가능  gas가 1씩 줄어든다
			}else { // gas가 0이거나 0보다 적을경우 실행됨
				System.out.println("멈춥니다.(gas 잔량: " + gas + ")");
				return; // return은 그 즉시 메소드를 종료한다
			}
		}
	}
}
