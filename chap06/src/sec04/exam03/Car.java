package sec04.exam03;

public class Car {
	//Field
	int gas;
	
	//Constructor
	
	//Method
	void setGas(int gas) {
		this.gas = gas; // gas�� �谳���� this.gas�� Field, �ܺηκ��� ���� gas�� this.gas(Field)�� �����ϴ� ������ �޼ҵ�
	}
	
	boolean isLeftGas() { // gas�� �����ִٸ� true ���ٸ� false�� ���ϰ����� �ϱ����� boolean���� ����Ÿ���� ����
		if(gas == 0) { // gas�� 0�̶�� 17���� ���Ϲ��� ����Ǿ� �޼ҵ尡 ����Ǿ� 20������ �����������
			System.out.println("gas�� �����ϴ�.");
			return false;
		} 
		System.out.println("gas�� �ֽ��ϴ�.");
		return true; // gas�� 0�� �ƴ϶�� 15������ false�� �Ǳ� ������ true�� ����ȴ�.
		}
	
	void run() {
		while(true) {
			if(gas > 0) {// gas�� 0�ʰ� �϶� �����
				System.out.println("�޸��ϴ�.(gas �ܷ�: " + gas + ")");
				gas -= 1; // gas--;�� ����  gas�� 1�� �پ���
			}else { // gas�� 0�̰ų� 0���� ������� �����
				System.out.println("����ϴ�.(gas �ܷ�: " + gas + ")");
				return; // return�� �� ��� �޼ҵ带 �����Ѵ�
			}
		}
	}
}
