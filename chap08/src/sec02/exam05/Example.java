package sec02.exam05;

public class Example {

	public static void main(String[] args) {
		
		ImplementationC impl = new ImplementationC();
		
		InterfaceA ia = impl;
		ia.methodA(); // �޼ҵ�ȣ��
		
		InterfaceB ib = impl;
		ib.methodB();		// InterfaceB���� methodB�� ����Ǿ��ֱ⋚���� methodB�� ȣ�Ⱑ���ϴ�
		
		InterfaceC ic = impl;
		ic.methodA();	// InterfaceC�� A,�� B�� ����ϰ��ֱ⶧���� �޼ҵ� A,B,C �� ȣ�Ⱑ���ϴ�
		ic.methodB();
		ic.methodC();

	}

}
