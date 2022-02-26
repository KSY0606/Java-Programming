package sec01.exam06;

public class MyClass {

	//필드
	RemoteControl rc = new Television();  
	
	//생성자
	MyClass(){
		
	}
	         //매개값으로 받은 rc를 필드인 rc에 저장
	MyClass(RemoteControl rc) {
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}
	//메소드
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);

	}
	
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(5);
	}
}  // 인터페이스(RemoteControl)는  필드의타입(6라인), 생성자(13라인)와 매개변수의 매개변수타입(26라인)으로 로컬변수의 타입(20라인)으로 사용된다
