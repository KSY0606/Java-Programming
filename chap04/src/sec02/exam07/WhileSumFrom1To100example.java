package sec02.exam07;

public class WhileSumFrom1To100example {

	public static void main(String[] args) {
		int sum = 0;		// sum에 0을 초기화
		int i = 1;			// i 에 1을 초기화
		while(i<=100) {		// i가 100이하일때까지 반복됨
			sum += i ;		// sum에 i값을 누적함
			i++;			// i 가 1씩 증가함
		}

		System.out.println("1~" + (i-1) + " 합: " + sum);   
	}		// while을 빠져나갈때 i값은 101이기 때문에 i-1을 해준다.

}
