package sec01.exam06;

public class SwitchNobreakCaseExample {

	public static void main(String[] args) {
		// 8<= ~ <12(8+4) 사이의 정수얻기
		int time = (int)(Math.random()*4) + 8;
		System.out.println("[현재 시각: " + time + "시]");
		
		switch(time) {
		case 8:
			System.out.println("출근합니다.");
		case 9:
			System.out.println("회의를 합니다.");
		case 10:
			System.out.println("업무를 봅니다.");
		default:
			System.out.println("외근을 나갑니다.");
			
		}				// time 8이 나올경우 break가 없기때문에 case8,9,0,11이 모두 실행된다.
						//      11이 나올경우는 default (외근을 나갑니다)만 실행된다.
	}

}
