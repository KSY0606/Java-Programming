package sec02.exam06;

public class ArrayInArrayExample {

	public static void main(String[] args) {
		
		int[][] mathScores = new int[2][3];
		for(int i=0; i<2; i++) {			// ���� [2]�̱� ������ i<2�� �Է�
			for(int k=0; k<3; k++) {			// ���� [3]�̱� ������ k<3�� �Է�
				System.out.println("mathScores[" + i + "][" + k + "]=" + mathScores[i][k]);
			}
		}
		System.out.println();
		
		int[][] englishScores = new int[2][];		//��ܽ� ����
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];
		for(int i=0; i<2; i++) {
			for(int k=0; k<englishScores[i].length; k++) { // 0�ε����࿡�� �����ϴ� �迭�� ���̴�2��,1�ε����࿡�� �����ϴ� �迭�� ���̴�3�̹Ƿ� k<3�� �����ʴ´�.
				System.out.println("englishScores[" + i + "][" + k + "]=" + englishScores[i][k]);
			}
		}
		
		System.out.println();
		
		int[][] javaScores = {{95, 80}, {92, 96, 80} }; // javaScores�� 2���� �迭�� �����ϰ�, ����� {}, {}�� 2���̴�. �� ���� ���� �߰�ȣ ���� 5���̴�.
		for(int i=0; i<2; i++) {
			for(int k=0; k<javaScores[i].length; k++) { // 0�ε����࿡�� �����ϴ� �迭�� ���̴�2��,1�ε����࿡�� �����ϴ� �迭�� ���̴�3�̹Ƿ� k<3�� �����ʴ´�.
				System.out.println("javaScores[" + i + "][" + k + "]=" + javaScores[i][k]);
			}
		}
	}

}
