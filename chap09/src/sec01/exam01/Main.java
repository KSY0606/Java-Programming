package sec01.exam01;

public class Main {

	public static void main(String[] args) {
	
		A a = new A();
		
		A.B b = a.new B();
		b.field1 = 3;
		b.method1();
		
		//static이 붙은 C객체는 A객체 없이도 만들수가 있다.
		A.C c = new A.C();
		//인스턴스 필드와 인스턴스메소드 사용
		c.field1 = 3;
		c.method1();
		//정적 필드와 정적 메소드 사용
		A.C.field2 = 3;
		A.C.method2();

		
		a.method();
	}

}
