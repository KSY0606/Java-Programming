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
			System.out.println(this.field); // this�� ���簴ü�� �����ϱ� ������ Nested��ü�� �����ϰԵȴ�
			this.method();
			
			System.out.println(Outter.this.field);
			Outter.this.method(); // �ٱ� ��ü�� �����Ҷ��� �ٱ�Ŭ�����̸��� this �տ� �ۼ����ش�
		}
	}
}
