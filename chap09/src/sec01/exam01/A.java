package sec01.exam01;

public class A {

	A() {
		System.out.println("A ��ü�� ������.");
	}
	// �ν��Ͻ� ��� Ŭ���� ����
	class B{
		B(){
			System.out.println("B ��ü�� ������.");
		}
		// �ν��Ͻ� �ʵ� ����
		int field1;
		// �ν��Ͻ� �޼ҵ� ����
		void method1() {}
		
	}
	
	// ���� ��� Ŭ���� ����
	static class C {
		C() {
			System.out.println("C ��ü�� ������.");
		}
		int field1;
		static int field2;
		void method1() {}
		static void method2() {}
	}
	
	// ���� Ŭ����
	void method() {
		class D {
			D() {
				System.out.println("D ��ü�� ������.");
			}
			int field1;
			//static int field2;  ���� Ŭ���� ������ �����ʵ带 ���� �� ����.
			void method1() {}
			//static void method2() {} �� ���Ұ���
			}
		
		D d = new D();
		d.field1 = 3;
		d.method1();
		}
	}

