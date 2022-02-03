package sec02.exam02;

public class ForSumFrom1To100Example {

	public static void main(String[] args) {  // 1~100까지 합을 출력
		int sum = 0;    				// sum에 0을 초기화
		
		for(int i=1; i<=100; i++) {     // i는 1부터시작한다, i는 100이하이다, i는 1씩 증가한다.
			sum += i;
		}
		System.out.println("1~100 합 : " + sum);
		
	}

}
