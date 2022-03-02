package sec01.exam01;

public class A {

	A() {
		System.out.println("A 객체가 생성됨.");
	}
	// 인스턴스 멤버 클래스 선언
	class B{
		B(){
			System.out.println("B 객체가 생성됨.");
		}
		// 인스턴스 필드 선언
		int field1;
		// 인스턴스 메소드 선언
		void method1() {}
		
	}
	
	// 정적 멤버 클래스 선언
	static class C {
		C() {
			System.out.println("C 객체가 생성됨.");
		}
		int field1;
		static int field2;
		void method1() {}
		static void method2() {}
	}
	
	// 로컬 클래스
	void method() {
		class D {
			D() {
				System.out.println("D 객체가 생성됨.");
			}
			int field1;
			//static int field2;  로컬 클래스 내에는 정적필드를 가질 수 없다.
			void method1() {}
			//static void method2() {} 도 사용불가능
			}
		
		D d = new D();
		d.field1 = 3;
		d.method1();
		}
	}

