package sec02.exam08;

public class ArrayCopyByForExample {

	public static void main(String[] args) {
		
		int[] oldIntArray = {1, 2, 3 };
		int[] newIntArray = new int[5]; // �迭�� ���̰� �����Ǹ� �ø��� ���� ������ ���ο� �迭�� ������ش�.

		for(int i = 0; i < oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i]; // �����迭�� i�ε��� ���� ���ο� �迭�� i�ε����� �����Ѵ�. 
		}
		for(int i = 0; i < newIntArray.length; i++) {	// newIntArray.length �ѱ��̰� 5�� 5�� �ݺ���.
			System.out.println(newIntArray[i] + ",");
		}
		}

	}

