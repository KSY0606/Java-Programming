package sec04.exam02;

public class ComputerExample {

	public static void main(String[] args) {
		
		Computer myCom = new Computer();	// ComputerŸ�Կ� myCom ������ �����ϰ� new�����ڷ� Computer �����ڸ� ȣ���ؼ� ��ü���� 
		
		int[] values1 = {1, 2, 3}; // ���� �������ִ� �迭 ����
		
		int result1 = myCom.sum1(values1); // sum1�� �迭�� ��Ҹ� ���� ���� ������� int���� �ְԵ�
		System.out.println("result1: " + result1);

		
		//�迭��ü�� ���� �������ʰ� sum1�� ȣ���Ҷ� �迭��ü ����
		int result2 = myCom.sum1(new int[] {1, 2, 3, 4, 5});
		System.out.println("reslut2: " + result2);
		
		int result3 = myCom.sum2(1, 2, 3); // 1,2,3�� �� ���� ������� result3�� �����
		System.out.println("result3: " + result3);
		
		int result4 = myCom.sum2(1, 2, 3, 4, 5);
		System.out.println("result4: " + result4);
	}

}
