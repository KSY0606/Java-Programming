package sec01.exam01;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "�Ź�ö";
		String strVar2 = "�Ź�ö";
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1�� strVar2�� ������ ����");  // strVar1 strVar2�� ������ ���Ƽ� ��µ�
		}else {
			System.out.println("strVar1�� strVar2�� ������ �ٸ�");
		}

		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1�� strVar2�� ���ڿ��� ����");  // ���ڿ��� ���� ������ ��µ�.
		}
		
		String strVar3 = new String("�Ź�ö");
		String strVar4 = new String("�Ź�ö");   // strVar3�� strVar4�� �����ϴ� ��ü�� �ٸ��Ƿ� false�� 25���� ��µ�
		
		if(strVar3 == strVar4) {
			System.out.println("strVar3�� strVar4�� ������ ����"); 
		}else {
			System.out.println("strVar3�� strVar4�� ������ �ٸ�");
		}

		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3�� strVar4�� ���ڿ��� ����");
				// strVar3�� strVar4�� �ٸ� ��ü�� ���������� ���ι��ڿ��� �����Ƿ� 28������ true�� ��µ�.
	}

	}
}
