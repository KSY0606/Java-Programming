package sec01.exam19;

public class StringToLowerUpperCaseExample {

	public static void main(String[] args) {
		
		String str1 = "Java Programming";
		String str2 = "JAVA Programming"; // ��ҹ��ڸ� �����ϱ⋚���� str1, str2�� ���� �ٸ� ���ڿ���
		System.out.println(str1.equals(str2));
		
		String lowerstr1 = str1.toLowerCase(); // str1�� �����ϴ� ���ڿ��� ���� �ҹ��ڷ� �ٲ� ���ο� ���ڿ��� �������
		String lowerstr2 = str2.toLowerCase();
		
		System.out.println(lowerstr1.equals(lowerstr2));
		
		System.out.println(str1.equalsIgnoreCase(str2)); // ��ҹ��ڸ� ���������ʾƵ� equalsIgnoreCase�� ����ϸ� �� ������ ������ �� �ִ�

	}

}
