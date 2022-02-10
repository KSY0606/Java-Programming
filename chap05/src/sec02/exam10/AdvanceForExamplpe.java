package sec02.exam10;

public class AdvanceForExamplpe {

	public static void main(String[] args) {
		int[] scores = { 95, 71, 84, 93, 87};
		
		int sum = 0;
		for(int score : scores) {
			sum = sum + score; // sum += score을 사용해도 됨
		}
		System.out.println("정수 종합 = " + sum);

		double avg = (double) sum / scores.length; // sum을 실수로 변환
		System.out.println("정수 평균 = " + avg);
	}
}