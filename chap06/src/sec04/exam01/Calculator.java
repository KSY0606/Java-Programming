package sec04.exam01;

public class Calculator {
	//Field
	//Constructor
	//Method
	void powerOn() { // �޼ҵ� ����
		System.out.println("������ �մϴ�.");
	}
	
	int plus(int x, int y) {   // �ܺο��� 2���� ���� �޾� ������ ��
		int result = x + y;
		return result; // reslut�� �������̶�� ������ return
	}
	
	double divide(int x, int y) {     // �ܺο��� 2���� ���� �޾� �������� ��
		double result =  (double)x / (double) y;
		return result;
	}
	
		void powerOff() { // �����, �ܺο��� �޾ƾ��ϴ� ���� ����
			System.out.println("������ ���ϴ�.");
	}
}
