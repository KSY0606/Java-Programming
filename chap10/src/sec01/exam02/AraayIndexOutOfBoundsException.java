package sec01.exam02;

public class AraayIndexOutOfBoundsException {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3};
				
		int result = arr[0] + arr[2];  // ������ �ε��� ��ȣ�� 2�̱⶧���� int result = arr[0] + arr[3];�̸� ������ �߻��Ѵ�
		
		// args�� ����Ű������� ���� 12,13������ �ۼ��� ��� AraayIndexOutOfBounds�� �߻��Ѵ�
		String data1 = args[0];
		String data2 = args[1];
		
		System.out.println(data1);
		System.out.println(data2);

	}

}
