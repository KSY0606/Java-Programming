package sec02.exam02;

public class ForSumFrom1To100Example {

	public static void main(String[] args) {  // 1~100���� ���� ���
		int sum = 0;    				// sum�� 0�� �ʱ�ȭ
		
		for(int i=1; i<=100; i++) {     // i�� 1���ͽ����Ѵ�, i�� 100�����̴�, i�� 1�� �����Ѵ�.
			sum += i;
		}
		System.out.println("1~100 �� : " + sum);
		
	}

}
