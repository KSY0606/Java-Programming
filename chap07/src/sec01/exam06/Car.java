package sec01.exam06;

public class Car {
	//필드
	public int speed;
	
	//생성자
	
	//메소드
	
	public void speedUp() {
		speed += 1; // speed 필드에 1을 추가한다
	}
	public final void stop() {  // final을 써서 재정의 불가능
		System.out.println("차를 멈춤");
		speed = 0;
	}
}
