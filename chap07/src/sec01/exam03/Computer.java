package sec01.exam03;

public class Computer extends Calculator { // Computer가 Calculator를 상속
	//메소드 재정의
	@Override
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r; //자바에서 제공해주는 Math.PI 입력
	}
}
