package sec01.exam02;

public class A {
	class B {}
	static class C {} // ���� ��� Ŭ����
	
	B field1 = new B();
	C field2 = new C();
	
	void method1() {
		B var1 = new B(); // BŸ���� ���ú��� var1 ����, B��ü ����
		C var2 = new C();
	}
	
	// static B field3 = new B();  A��ü�� �־�� ����� �ִ� B��ü�� ��������ؼ� ������ ���� �߻�
	static C field4 = new C();
	
	static void method2() {  // method2�� A��ü�� ��� ȣ���� ������ 
		// B var1 = new B();  B��ü�� A�� �ʿ�� �Ǳ⶧���� �����Ͽ��� �߻�
		C var2 = new C();
	}
}
