package sec06.exam05.package1;

public class B {
	public B() {
		A a = new A(); // A와 같은 패키지로 객체를 생성해 필드와 메소드에 접근이 가능함
		a.field = 10;
		a.method();
	}
	
	public void method() {
		A a = new A();
		a.field = 10;
		a.method();
	}
}
