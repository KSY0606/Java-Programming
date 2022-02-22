package sec02.exam01;

public class PromotionExample {

	public static void main(String[] args) {
		
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b;		// A타입을 상속받고 있기때문에 자동타입변환이 되면서 대입이 가능해짐	
		A a2 = c;
		A a3 = d;
		A a4 = e;

		B b1 = d;
		C c1 = e;
		
		// B b2 = e; 상속되어있지않기 때문에 컴파일 에러발생 
		// C c2 = d;
	}

}
