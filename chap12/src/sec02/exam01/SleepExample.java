package sec02.exam01;

import java.awt.Toolkit;

public class SleepExample {

	public static void main(String[] args) {

		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 10; i++) { // ������ 10�� �ݺ�
			toolkit.beep();
			try {
				Thread.sleep(3000); // 3�ʵ��� ���ν����带 �Ͻ����� ���·� ����
			}catch(InterruptedException e) {}
		}
	}

}
