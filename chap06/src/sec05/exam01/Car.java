package sec05.exam01;

public class Car {
	//Field         
	String model;  // model은 인스턴스필드가 됨    객체가 있어야만 존재하는 필드
	int speed; // speed도 인스턴스필드
	
	//Constructor
	Car(String model){
		this.model = model; // Field의 이름과 매개변수이름이 model이기때문에 this.을 붙여준다
	}
	
	// Method
	void setSpeed(int speed) {
		this.speed = speed; // this.를 붙여주지않으면 매개변수의 값을 매개변수에 저장하는게 됨
	}
	
	void run() {
		for(int i=10; i<=50; i+=10) {
			setSpeed(i); 
			System.out.println(model + "가 달립니다.(시속:" + speed + "km/h)");
		}
	}
}
