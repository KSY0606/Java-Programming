package sec03.exam02;

public abstract class Animal {  // 추상클래스
	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	public abstract void sound(); // 추상메소드로 선언 

}
