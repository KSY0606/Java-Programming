package sec02.exam01;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		/* String str = null;
		System.out.println(str.length()); nullpointerException �߻�*/
		
		try {
			Class clazz = Class.forName("java.lang.String"); // ���ܰ� �߻������ʴ´ٸ� "�������"�� ��µȴ�
			System.out.println("�������");
		} catch (ClassNotFoundException e) {
			System.out.println("Ŭ������ �������� �ʽ��ϴ�."); // ���ܰ� �߻��ϰԵǸ� 13������ ����� ex)10���� ("java.lang.String"2)�� �ۼ��Ǹ� ���ܹ߻�
		}

	}

}
