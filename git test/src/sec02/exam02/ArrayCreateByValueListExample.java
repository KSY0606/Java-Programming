package sec02.exam02;

public class ArrayCreateByValueListExample {

	public static void main(String[] args) {
		int[] scores;
		scores = new int[] { 83, 90, 87 };  // new int[]�� �ٿ����� ������ �����Ͽ����� ��.
		int sum1 = 0;
		for(int i=0; i<3; i++) {
			sum1 += scores[i];
		}
		System.out.println("����: " + sum1);

		int sum2 = add(new int[] { 83, 90, 87 }); // add�� 23������ sum�� �������ִ°� �޾ƾ��ϱ⶧���� �տ� int sum2�� ���ش�. 
		System.out.println("����: " + sum2);
	}
	
	public static int add(int[] scores) {  // �޼ҵ� ����
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		return sum;
	}

}
