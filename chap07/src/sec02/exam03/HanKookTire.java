package sec02.exam03;

public class HanKookTire extends Tire { // Trie를 상속
	//필드
	//생성자
	public HanKookTire(String location, int maxRotation) {
		super(location, maxRotation); // 부모의 생성사 호출
	}
	//메소드
	@Override
	public boolean roll() { 
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " HanKookTire 수명: " + (maxRotation-accumulatedRotation)+ "회");
			return true;
		} else {
			System.out.println("*** " + location + " HanKookTire 펑크***");
			return false;
	}
}
}