package sec01.exam02;

public class BeepPrintExample2 {

	public static void main(String[] args) {

		Runnable beepTask = new BeepTask(); // 객체생성
		Thread thread = new Thread(beepTask);
		thread.start(); // BeepTask 호출해 메소드가 실행되어 비프음 발생
		
		for(int i = 0; i < 5; i++) {	// 위와 동시에 0.5초 간격으로 "띵" 출력
			System.out.println("띵");
			try {Thread.sleep(500);}
			catch(Exception e) {}
		}
	}

}
