package sec02.exam10;

public class ContinueExample {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {		//i�� 1���ͽ����ϰ�,10�����϶����� �ݺ��Ǹ�, i�� 1�� �����Ѵ�.
			if(i%2 !=0) {			// i%2 = i�� 2�� ���� ������.  !=0 0�� �ƴϴ�. Ȧ������ ���°���.
				continue;		// Ȧ���� ��� �ٽ� for������ ���ư��� ¦���� ��� ����̵ȴ�.
			}
			System.out.println(i);
		}

	}

}
