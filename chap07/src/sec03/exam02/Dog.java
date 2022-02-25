package sec03.exam02;

public class Dog extends Animal { // Animal의 sound를 재정의 해주지 않으면 컴파일 에러 발생
	public Dog() {
		this.kind = "포유류";
	}
	
	@Override
	public void sound() {
		System.out.println("멍멍");
		
	}
}
