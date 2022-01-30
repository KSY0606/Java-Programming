package sec01.exam02;

public class IfElseExample {

	public static void main(String[] args) {
		int score = 85;  // score를 85로 초기화
		
		if(score>=90) {   
			System.out.println("점수가 90보다 큽니다.");  
			System.out.println("등급은 A입니다.");       // if문의 조건식이 false이므로
		}else {										 // else블럭의 코드가 실행된다.
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
		}
		
		System.out.println("종료"); // 위 코드가 실행된 후 이 코드가 실행된다   
	
		
	} 
} 
