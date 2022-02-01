package sec02.exam10;

public class ContinueExample {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {		//i가 1부터시작하고,10이하일때까지 반복되며, i는 1씩 증가한다.
			if(i%2 !=0) {			// i%2 = i를 2로 나눈 나머지.  !=0 0이 아니다. 홀수인지 묻는것임.
				continue;		// 홀수일 경우 다시 for문으로 돌아가고 짝수일 경우 출력이된다.
			}
			System.out.println(i);
		}

	}

}
