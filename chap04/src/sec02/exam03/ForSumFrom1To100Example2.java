package sec02.exam03;

public class ForSumFrom1To100Example2 {

	public static void main(String[] args) {
		int sum = 0;
		
		int i = 0;
		for(i=1; i<=100; i++) {
			sum += i;
		}

		System.out.println("1~" + (i-1) + " 합 : " + sum);
	}
			//for블럭에 int i를 사용할경우 블럭 밖에서는 쓸수 없기때문에 밖으로 빼 13라인에 i를 써줌.
}
