package sec02.exam10;

public class AdvanceForExamplpe {

	public static void main(String[] args) {
		int[] scores = { 95, 71, 84, 93, 87};
		
		int sum = 0;
		for(int score : scores) {
			sum = sum + score; // sum += score�� ����ص� ��
		}
		System.out.println("���� ���� = " + sum);

		double avg = (double) sum / scores.length; // sum�� �Ǽ��� ��ȯ
		System.out.println("���� ��� = " + avg);
	}
}