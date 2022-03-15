package sec02.exam01;

import java.awt.Toolkit;

public class SleepExample {

	public static void main(String[] args) {

		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 10; i++) { // 비프음 10번 반복
			toolkit.beep();
			try {
				Thread.sleep(3000); // 3초동안 메인스레드를 일시정지 상태로 만듦
			}catch(InterruptedException e) {}
		}
	}

}
