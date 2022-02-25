package sec03.exam01;

public abstract class Phone {  // 추상클래스로 만들어 주기위해 abstract 
	//필드  
	public String owner; // 소유자 정보가 저장되는 owner필드 
	
	//생성자
	public Phone(String owner) {  //외부로부터 owner정보를 입력받아 저장
	this.owner = owner;
	}
	
	//메소드
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
		
	}
	
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
}
