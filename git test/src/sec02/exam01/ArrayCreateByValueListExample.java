package sec02.exam01;

public class ArrayCreateByValueListExample {

	public static void main(String[] args) {
			// �� ������� �迭 ����. 
		int[] scores = {83, 90, 87 }; 			//0�ε����� 83, 1�ε����� 90, 2�ε������� 87�� ������ �Ǵ� �迭��ü�� �������.
		
		System.out.println("scores[0]: " + scores[0]); 
		System.out.println("scores[1]: " + scores[1]);
		System.out.println("scores[2]: " + scores[2]);
		
		// �հ� ��� ���ϱ�.
		
		int sum = 0;
		for(int i=0; i<3; i++) {	//	�ε���0���� ��������ϹǷ� i�� 0���� ���۵ȴ�; i�� 3�̸����� �ݺ��Ѵ�; �ݺ��Ҷ����� 1�� ������Ų��.
			sum += scores[i];		//  i�� �Է����ָ鼭 �ε���0,1,2�� ���������� �Ѵ�.
		}
		System.out.println("�� ��: " + sum);
		double avg = (double) sum / 3;  // ��� ���ϱ�, �Ҽ����� ���ü��ֵ��� sum�� �Ǽ��� ��ȯ����.
		System.out.println("���: " + avg);
	}

}
