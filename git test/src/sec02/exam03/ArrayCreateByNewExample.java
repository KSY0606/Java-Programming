package sec02.exam03;

public class ArrayCreateByNewExample {

	public static void main(String[] args) {
		
		int[] arr1 = new int[3];  // int�迭 ����3�� ����� ����.
		for(int i=0; i<3; i++) {  // �ε����� 0���� �����Ѵ�; ������ �ε����� 2�̹Ƿ� 3�̸��϶����� �ݺ��Ѵ�; 1�� �ݺ��Ҷ����� 1�� �����Ѵ�. 
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}

		arr1[0] = 10;  		// �� �ε����� �ٸ����� �����ϰ�ʹٸ� 12,13,14����ó�� �Է����ش�.  
		arr1[1] = 20;
		arr1[2] = 30;
		for(int i=0; i<3; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}
		
		double[] arr2 = new double[3]; 		// double Ÿ�� �迭 ���� ���� 
		for(int i=0; i<3; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}
		
		arr2[0] = 0.1;			// �ε����� ���ο� ���� �����ϰ�ʹٸ�...
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		for(int i=0; i<3; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}
		
		String[] arr3 = new String[3];		// �迭�� �����ϴµ� ������ �� �ִ� ����� ���� 3�̴�.
		for(int i=0; i<3; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}
		
		arr3[0] = "1��";
		arr3[1] = "2��";
		arr3[2] = "3��";
		for(int i=0; i<3; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}
	}

}
