package sec02.exam02;

public class PrintThread1 extends Thread{
	private boolean stop;
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	public void run() {
		while(!stop) {
			System.out.println("실행중");
		}
		System.out.println("자원정리");
		System.out.println("실행종료");
	}
}
