package sec02.exam07;

public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
		
		String[] strArray = new String[3];
		strArray[0] = "Java";
		strArray[1] = "Java";		// ���ڿ� ��Ʈ���� ������ ������ String��ü�� �����Ѵ�.
		strArray[2] = new String("Java"); 	// [0][1]�ε����� ����� ������ �ٸ���.
		
		System.out.println(strArray[0] == strArray[1]); // �ε���0�� �ε���1�� �����ϴ� ��ü�� ���İ� ����.
		System.out.println(strArray[0] == strArray[2]);
		System.out.println(strArray[0].equals(strArray[2]));
	}

}
