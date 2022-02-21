package sec01.exam06;

public class SportsCar extends Car { // Car를 상속함
	@Override   // 메소드 재정의
	public void speedUp() {
		speed += 10; 
	}
	
	// stop은 final을 사용했기 때문에 재정의가 안됨
}
