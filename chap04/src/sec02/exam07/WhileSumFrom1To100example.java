package sec02.exam07;

public class WhileSumFrom1To100example {

	public static void main(String[] args) {
		int sum = 0;		// sum�� 0�� �ʱ�ȭ
		int i = 1;			// i �� 1�� �ʱ�ȭ
		while(i<=100) {		// i�� 100�����϶����� �ݺ���
			sum += i ;		// sum�� i���� ������
			i++;			// i �� 1�� ������
		}

		System.out.println("1~" + (i-1) + " ��: " + sum);   
	}		// while�� ���������� i���� 101�̱� ������ i-1�� ���ش�.

}
