package sec02.exam01;

public class AnonymousExample {

	public static void main(String[] args) {
		
		Anonymous anony = new Anonymous();
		
		anony.field.wake();
		
		anony.method1();
		
		anony.method2(new Person() { // �͸��ڽİ�ü ����
			
			void study() {
				System.out.println("�����մϴ�.");
			}
			
			@Override
			void wake() {
			System.out.println("8�ÿ� �Ͼ�ϴ�.");
			study();
			}
		});

	}

}