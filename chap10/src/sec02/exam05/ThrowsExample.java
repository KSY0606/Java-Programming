package sec02.exam05;

public class ThrowsExample {

	public static void main(String[] args) {
		
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		}

	}

	public static void findClass() throws ClassNotFoundException { // findClass�� ȣ���ϴ� ������ ���ܸ� ������ �� (8�������� ���� ��)
		Class clazz = Class.forName("java.lang.String2"); // String2��� Ŭ������ ���� ���ܰ� �߻��Ѵ�
	}
}
