package sec06.exam06;

public class Car {
	//Field
	private int speed;
	private boolean stop;

	//Method
	public int getSpeed() { // 필드타입이 리턴타입이 됨(5라인 int-9라인 int), get+필드이름 
		return speed;
	}
	public void setSpeed(int speed) {
		if(speed < 0) { // speed에 음수가 오면 0값으로 되게 설정
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}
		this.speed = speed;
	}
	public boolean isStop() { // boolean의 경우 getter메소드는 is로 시작함
		return stop;
	}
	public void setStop(boolean stop) { // 필드와 동일한 타입의 매개변수를 선언하고 필드에 저장한다
		this.stop = stop;
			speed = 0;
	}
}
