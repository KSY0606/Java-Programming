package sec01.exam04;

public class BeepPrintExample4 {

	public static void main(String[] args) {

		Thread thread = new BeepThread(); // BeepThread ��ü����
		thread.start(); // BeepThread�� run�޼ҵ� ����
		
		for(int i = 0; i < 5; i++) { // 0.5�ʰ������� "��" ���
			System.out.println("��");
			try {Thread.sleep(500);}
			catch(Exception e) {}
		}
	}

}
