package sec02.exam04;

public class ArrayLenghtExample {

	public static void main(String[] args) {
		int[] scores = {83, 90, 87};
		
		int sum = 0;
		for(int i=0; i<3; i++) { // i<3�� 3�� 6������ ������� �����ε� 3�� �ڸ��� scores.length�� ���� �� �ִ�.
			sum += scores[i];
			
		}
		System.out.println("����: " + sum);

		double avg = (double) sum / 3;  // 3���� �����ִ� ��� �����ϰ� socres.length�� �� �� �ִ�.
		System.out.println("���: " + avg);
		
		double avg1 = (double) sum / scores.length;  
		System.out.println("avr1 ���: " + avg1);
	}	

}
