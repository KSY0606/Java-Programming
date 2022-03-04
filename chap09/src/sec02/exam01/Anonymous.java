package sec02.exam01;

public class Anonymous {
		// Person클래스를 가지고 필드선언
	Person field = new Person() {
	void work() { 
		System.out.println("출근합니다.");
	}
	@Override
	void wake() {
		System.out.println("6시에 일어납니다.");
		work();
	};
};

		void method1() {
			Person localVar = new Person() {
				
				void walk() {
					System.out.println("산책합니다.");
				}
				// Person이 가지고 있는 메소드 재정의
				@Override
				void wake() {
					System.out.println("7시에 일어납니다.");
					walk();
				}
			};
			
			localVar.wake();
		}
		
		void method2(Person person) {
			person.wake();
		}
}