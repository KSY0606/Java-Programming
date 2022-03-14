package sec01.exam01;

import java.awt.Toolkit;

public class BeepPrintExample {

	public static void main(String[] args) {  // 비프음을 모두 발생한 후 출력을 시작하게 됨

		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 5; i++) {
			toolkit.beep(); // 비프음 발생
			try {Thread.sleep(500);} catch(Exception e) {}
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {Thread.sleep(500);} catch(Exception e) {}
		}
	}

}
