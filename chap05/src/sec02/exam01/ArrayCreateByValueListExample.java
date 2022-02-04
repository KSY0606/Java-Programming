package sec02.exam01;

public class ArrayCreateByValueListExample {

	public static void main(String[] args) {
			// 값 목록으로 배열 생성. 
		int[] scores = {83, 90, 87 }; 			//0인덱스는 83, 1인덱스는 90, 2인덱스에는 87이 저장이 되는 배열객체가 만들어짐.
		
		System.out.println("scores[0]: " + scores[0]); 
		System.out.println("scores[1]: " + scores[1]);
		System.out.println("scores[2]: " + scores[2]);
		
		// 합과 평균 구하기.
		
		int sum = 0;
		for(int i=0; i<3; i++) {	//	인덱스0부터 더해줘야하므로 i는 0부터 시작된다; i의 3미만까지 반복한다; 반복할때마다 1씩 증가시킨다.
			sum += scores[i];		//  i를 입력해주면서 인덱스0,1,2가 더해지도록 한다.
		}
		System.out.println("총 합: " + sum);
		double avg = (double) sum / 3;  // 평균 구하기, 소수점이 나올수있도록 sum을 실수로 변환해줌.
		System.out.println("평균: " + avg);
	}

}
