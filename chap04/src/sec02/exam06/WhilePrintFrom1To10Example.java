package sec02.exam06;

public class WhilePrintFrom1To10Example {

	public static void main(String[] args) {
		int i = 1;			// i에 1을 초기화
		while(i<=10) {		// i가 10이하일때까지 반복됨 
			System.out.println(i);
			i++;			// i가 1씩 증가할수 있도록 ++를 붙여줌.
		}
							//i가 11이 되면 false되어 더이상 실행되지않음.
	}

}
