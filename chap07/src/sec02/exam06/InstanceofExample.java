package sec02.exam06;

public class InstanceofExample {

	public static void main(String[] args) {

		Parent parentA = new Child(); // Child 객체 생성
		method1(parentA);  // parentA는 11라인 parent로 대입되어 true가 된다
		
		Parent parentB = new Parent();
		method1(parentB); // 11라인으로 대입되는건 문제없지만 15라인에서는 false가 나와 else가 실행된다
	}
								// parent 매개변수 선언 
	public static void method1(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("method1 - Child로 변환 성공");
		} else {
			System.out.println("method1 - Child로 변환되지 않음");
		}
	}
}