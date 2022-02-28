package sec02.exam05;

public class Example {

	public static void main(String[] args) {
		
		ImplementationC impl = new ImplementationC();
		
		InterfaceA ia = impl;
		ia.methodA(); // 메소드호출
		
		InterfaceB ib = impl;
		ib.methodB();		// InterfaceB에는 methodB만 선언되어있기떄문에 methodB만 호출가능하다
		
		InterfaceC ic = impl;
		ic.methodA();	// InterfaceC는 A,와 B를 상속하고있기때문에 메소드 A,B,C 다 호출가능하다
		ic.methodB();
		ic.methodC();

	}

}
