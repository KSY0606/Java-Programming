package sec04.exam04;

public class Calculator {
	//Field
	//Constructor
	//Method
	int plus(int x, int y) { // int Ÿ���� ���� ����, �޼ҵ��̸�:plus, �ܺη� ���� int�� x,y�� ����
		int result =  + y;
		return result; // ������ ����� ���ϰ����� ����
	}
	
	double avg(int x, int y) { // doubleŸ���� ���� ����,�޼ҵ��̸�: avg
		// double sum = x + y;�� �������� 7���ο� plus�޼ҵ带 �����߱⶧���� ȣ���ؼ� sum�� ����.
		double sum = plus(x, y); 
		double result = sum / 2;
		return result;
	}
	//return���� ���°��
	void execute() {
		double result = avg(7, 10); // 7�� x�� ����  10�� y�� ���Ե�
		println("������: " + result);
	}
	
	void println(String message) {
		System.out.println(message);
	}
}
