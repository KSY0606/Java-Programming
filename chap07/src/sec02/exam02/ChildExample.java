package sec02.exam02;

public class ChildExample {

	public static void main(String[] args) {
		 Child child = new Child(); // 객체 생성
		 
		 Parent parent = child; // 자식객체를 부모타입에 대입
		 
		 parent.method1();
		 parent.method2(); // 재정의된 메소드가 호출됨
		 // parent.method3(); parent타입에는 method3이 선언되지않았기때문에 안됨
		 // 타입변환이 되었기때문에 child.method3();은 가능하다

	}

}
