package sec01.exam04;

public class BeepPrintExample4 {

	public static void main(String[] args) {

		Thread thread = new BeepThread(); // BeepThread 객체생성
		thread.start(); // BeepThread의 run메소드 실행
		
		for(int i = 0; i < 5; i++) { // 0.5초간격으로 "띵" 출력
			System.out.println("띵");
			try {Thread.sleep(500);}
			catch(Exception e) {}
		}
	}

}
