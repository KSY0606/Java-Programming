package sec04.exam03;

public class CarExample {

	public static void main(String[] args) {
		
		Car myCar = new Car(); // Car 객체 생성
		
		myCar.setGas(5); // setGas메소드는 int의 매개값을 받음
		
		boolean gasState = myCar.isLeftGas(); // 현재 연료가 남아있다면 true 남아있지 않다면 false
		if(gasState) {
			System.out.println("출발합니다.");
			myCar.run();
		}

		if(myCar.isLeftGas()) { // myCar가 참조하는 객체에 isLeftGas라는 메소드를 호출하고 리턴값이 true라면 실행된다
			System.out.println("gas를 주입할 필요가 없습니다.");		// false라면 19라인이 실행된다
		}else {
			System.out.println("gas를 주입하세요.");
		}
	}

}
