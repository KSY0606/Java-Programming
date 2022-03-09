package sec01.exam06;

public class ExitExample {

	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			System.out.println(i);
			if(i == 5) {
				//System.exit(0);  // i가 5가 되면 시스템을 종료함 14라인은 실행되지않음
				break; // for문을 빠져나와 14라인이 실행됨
			}
		}
		
		System.out.println("마무리 코드"); 

	}

}
