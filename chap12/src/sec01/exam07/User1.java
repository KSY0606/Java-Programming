package sec01.exam07;

public class User1 extends Thread{
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.setName("User1"); // ������ �̸��� User1�� ����
		this.calculator = calculator; // ���� ��ü�� calculator�� �ʵ忡 ����
	}
	
	public void run() {
		calculator.setMemory(100);
	}
}
