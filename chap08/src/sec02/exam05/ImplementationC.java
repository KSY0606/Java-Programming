package sec02.exam05;

public class ImplementationC implements InterfaceC {
			//	InterfaceC에 A,B가 상속되어있기 때문에 메소드가 3개다
	@Override
	public void methodA() {
		System.out.println("ImplementationC-methodA() 실행");
		
	}

	@Override
	public void methodB() {
		System.out.println("ImplementationC-methodB() 실행");
		
	}

	@Override
	public void methodC() {
		System.out.println("ImplementationC-methodC() 실행");
		
	}

}
