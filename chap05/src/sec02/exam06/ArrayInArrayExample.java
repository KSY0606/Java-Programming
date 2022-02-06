package sec02.exam06;

public class ArrayInArrayExample {

	public static void main(String[] args) {
		
		int[][] mathScores = new int[2][3];
		for(int i=0; i<2; i++) {			// 행이 [2]이기 때문에 i<2를 입력
			for(int k=0; k<3; k++) {			// 열이 [3]이기 때문에 k<3을 입력
				System.out.println("mathScores[" + i + "][" + k + "]=" + mathScores[i][k]);
			}
		}
		System.out.println();
		
		int[][] englishScores = new int[2][];		//계단식 구조
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];
		for(int i=0; i<2; i++) {
			for(int k=0; k<englishScores[i].length; k++) { // 0인덱스행에서 참조하는 배열의 길이는2고,1인덱스행에서 참조하는 배열의 길이는3이므로 k<3을 쓰지않는다.
				System.out.println("englishScores[" + i + "][" + k + "]=" + englishScores[i][k]);
			}
		}
		
		System.out.println();
		
		int[][] javaScores = {{95, 80}, {92, 96, 80} }; // javaScores는 2차원 배열을 참조하고, 행수는 {}, {}로 2개이다. 열 수는 안쪽 중괄호 안의 5개이다.
		for(int i=0; i<2; i++) {
			for(int k=0; k<javaScores[i].length; k++) { // 0인덱스행에서 참조하는 배열의 길이는2고,1인덱스행에서 참조하는 배열의 길이는3이므로 k<3을 쓰지않는다.
				System.out.println("javaScores[" + i + "][" + k + "]=" + javaScores[i][k]);
			}
		}
	}

}
