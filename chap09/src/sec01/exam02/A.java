package sec01.exam02;

public class A {
	class B {}
	static class C {} // 정적 멤버 클래스
	
	B field1 = new B();
	C field2 = new C();
	
	void method1() {
		B var1 = new B(); // B타입의 로컬변수 var1 선언, B객체 생성
		C var2 = new C();
	}
	
	// static B field3 = new B();  A객체가 있어야 만들수 있는 B객체를 만들려고해서 컴파일 에러 발생
	static C field4 = new C();
	
	static void method2() {  // method2는 A객체가 없어도 호출이 되지만 
		// B var1 = new B();  B객체는 A가 필요로 되기때문에 컴파일에러 발생
		C var2 = new C();
	}
}
