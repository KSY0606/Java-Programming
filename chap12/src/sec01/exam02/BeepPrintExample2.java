package sec01.exam02;

public class BeepPrintExample2 {

	public static void main(String[] args) {

		Runnable beepTask = new BeepTask(); // ��ü����
		Thread thread = new Thread(beepTask);
		thread.start(); // BeepTask ȣ���� �޼ҵ尡 ����Ǿ� ������ �߻�
		
		for(int i = 0; i < 5; i++) {	// ���� ���ÿ� 0.5�� �������� "��" ���
			System.out.println("��");
			try {Thread.sleep(500);}
			catch(Exception e) {}
		}
	}

}
