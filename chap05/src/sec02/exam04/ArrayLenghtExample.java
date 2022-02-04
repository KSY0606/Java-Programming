package sec02.exam04;

public class ArrayLenghtExample {

	public static void main(String[] args) {
		int[] scores = {83, 90, 87};
		
		int sum = 0;
		for(int i=0; i<3; i++) { // i<3의 3은 6라인의 값목록의 갯수인데 3의 자리에 scores.length를 넣을 수 있다.
			sum += scores[i];
			
		}
		System.out.println("총합: " + sum);

		double avg = (double) sum / 3;  // 3으로 나눠주는 대신 동일하게 socres.length를 쓸 수 있다.
		System.out.println("평균: " + avg);
		
		double avg1 = (double) sum / scores.length;  
		System.out.println("avr1 평균: " + avg1);
	}	

}
