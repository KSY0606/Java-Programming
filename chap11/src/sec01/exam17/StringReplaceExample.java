package sec01.exam17;

public class StringReplaceExample {

	public static void main(String[] args) {
		
		String oldstr = "�ڹٴ� ��ü ���� ����Դϴ�. �ڹٴ� Ǫ���� API�� �����մϴ�.";
		String newstr = oldstr.replace("�ڹ�", "JAVA");	// �������ڿ��� "�ڹ�"�� "JAVA"�� ��������. �������ڿ��� �ٲ�������
		System.out.println(oldstr);
		System.out.println(newstr);

	}

}
