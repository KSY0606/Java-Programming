package sec01.exam07;

public class Calculator {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	public void setMemory(int memory) { // ���� �޸𸮿� ���� �����ϴ� �޼ҵ�
		this.memory = memory;  // �ް����� memory�ʵ忡 ����
		try {
			Thread.sleep(2000);			// �����带 2�ʰ� �Ͻ�����.,
		}catch(InterruptedException e) {}
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
	}
}
