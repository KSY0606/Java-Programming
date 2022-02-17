package sec04.exam05;

public class Car {
	//Field
	int speed;
	
	//Constuctor
	
	//Method
	int getspeed() { //외부로부턴 값을 받지않음
		return speed; // 필드값을 읽고 리턴하도록 작성
	}
	void keyTurnOn() {
		System.out.println("키를 돌립니다.");
	}
	
	void run() {
		for(int i=0; i<=50; i+=10) { // i는 0부터 시작하고; i는50이하일때까지 반복되고,i가 반복될때마다 10씩 증가한다
			speed = i; // speed의 값을 i로 저장
			System.out.println("달립니다.(시속:" + speed + "km/h)");
		}
	}
}
