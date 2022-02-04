package sec02.exam02;

public class ArrayCreateByValueListExample {

	public static void main(String[] args) {
		int[] scores;
		scores = new int[] { 83, 90, 87 };  // new int[]를 붙여주지 않으면 컴파일에러가 남.
		int sum1 = 0;
		for(int i=0; i<3; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합: " + sum1);

		int sum2 = add(new int[] { 83, 90, 87 }); // add가 23라인의 sum을 리턴해주는걸 받아야하기때문에 앞에 int sum2를 써준다. 
		System.out.println("총합: " + sum2);
	}
	
	public static int add(int[] scores) {  // 메소드 선언
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		return sum;
	}

}
