package sec01.exam12;

public class StringCharExample {

	public static void main(String[] args) {
		String ssn = "010625-1230123"; // �ֹι�ȣ ���ڸ� ù��°�ڸ��� �ε���7��ġ
		
		char sex = ssn.charAt(7);
		
		switch(sex) { // �ε���7�� ��ġ�� ���� ���� ���೻���� �ٲ�
			case '1':
			case '3':
				System.out.println("�����Դϴ�.");
				break;
			case '2':
			case '4':
				System.out.println("�����Դϴ�.");
				break;
		}

	}

}
