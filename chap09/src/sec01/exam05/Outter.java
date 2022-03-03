package sec01.exam05;

public class Outter {
	String field = "Outter - field";
	void method() {
		System.out.println("Outter - method");
	}
	
	class Nested {
		String field = "Nested - field";
		void method() {
			System.out.println("Nested - method");
		}
		
		void print() {
			System.out.println(this.field); // this는 현재객체를 참조하기 때문에 Nested객체를 참조하게된다
			this.method();
			
			System.out.println(Outter.this.field);
			Outter.this.method(); // 바깥 객체를 참조할때는 바깥클래스이름을 this 앞에 작성해준다
		}
	}
}
