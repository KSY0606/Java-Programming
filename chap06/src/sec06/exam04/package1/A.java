package sec06.exam04.package1;

public class A {
	// public A() {}  생성자   public을 사용하면 외부 클래스에서도 자유롭게 사용가능
	// private A() {} 를 사용하면 C.java와 같은 패키지인 B클래스에서도 사용 불가	
	
	A field = new A();
	
	public A() {}
}
