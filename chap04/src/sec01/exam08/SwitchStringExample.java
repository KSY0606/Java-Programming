package sec01.exam08;

public class SwitchStringExample {

	public static void main(String[] args) {
		String position = "����"; 			// position�� "����"�� �ʱ�ȭ��.
		
		switch(position) {
		case "����":
			System.out.println("700����");	// position�� "����"�� ��� 700������ ������� break��.
			break;
		case "����":
			System.out.println("500����");
			break;
		default:
			System.out.println("300����");
			
		}
	}
}
