package sec02.exam04;

public class ForFloatCounterExample {

	public static void main(String[] args) {
		for(float x=0.1f; x<=1.0f; x+=0.1f) {  // 0.1f�� �ʱ�ȭ, x�� 1.0�����϶��� �ݺ�, �ݺ��Ҷ����� x�� 0.1f�� �߰�
			System.out.println(x);
		}
					// �ݺ��Ǹ鼭 x�� 0.1���� Ŀ�������Ƿ� 10������� �����ʰ� 9���� �ݺ���. 
	}

}
