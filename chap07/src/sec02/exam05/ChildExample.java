package sec02.exam05;

public class ChildExample {

	public static void main(String[] args) {
		
		Parent parent = new Child(); // parent 타입의 변수 선언   자식객체 대입
		
		parent.field1 = "data1";  // parent에서 선언된 것만 사용 가능함
		parent.method1();
		parent.method2();
		
		// field2와 method3을 사용하고 싶다면
		Child child = (Child) parent;   // 원래 객체였던 Child로 강제타입변환
		
		child.field2 = "data2";
		child.method3();

	}
}
