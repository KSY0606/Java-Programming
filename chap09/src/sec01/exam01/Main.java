package sec01.exam01;

public class Main {

	public static void main(String[] args) {
	
		A a = new A();
		
		A.B b = a.new B();
		b.field1 = 3;
		b.method1();
		
		//static�� ���� C��ü�� A��ü ���̵� ������� �ִ�.
		A.C c = new A.C();
		//�ν��Ͻ� �ʵ�� �ν��Ͻ��޼ҵ� ���
		c.field1 = 3;
		c.method1();
		//���� �ʵ�� ���� �޼ҵ� ���
		A.C.field2 = 3;
		A.C.method2();

		
		a.method();
	}

}
