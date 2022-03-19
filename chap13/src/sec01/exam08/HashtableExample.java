package sec01.exam08;

import java.util.*;

public class HashtableExample {

	public static void main(String[] args) {

		Map<String, String> map = new Hashtable<String, String>();
		
		map.put("spring", "12");
		map.put("summer", "123");  // ���̵�� ��й�ȣ�� �̸� ������
		map.put("fall", "1234");
		map.put("winter", "12345");
	
	
	Scanner scanner = new Scanner(System.in);
	
	while(true) {
		System.out.println("���̵�� ��й�ȣ�� �Է����ּ���.");
		System.out.print("���̵�: ");
		String id = scanner.nextLine(); // Ű����� �Է��� ���̵� ����
		
		System.out.print("��й�ȣ: ");
		String password = scanner.nextLine();
		System.out.println();
		
		if(map.containsKey(id)) {
			if(map.get(id).equals(password)) { //��й�ȣ ��
				System.out.println("�α��εǾ����ϴ�.");
				break;
			}else {
				System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			}
		} else {
			System.out.println("�Է��Ͻ� ���̵� �������� �ʽ��ϴ�.");
		}
	}
	}
}