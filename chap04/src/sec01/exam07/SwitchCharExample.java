package sec01.exam07;

public class SwitchCharExample {

	public static void main(String[] args) {
		char grade = 'B'; //	변수 grade에 B를 초기화
		
		switch(grade) {
		case 'A':                    //비어있는 경우 아무것도 실행되지 않음.
		case 'a':					 // grade가 a일경우 우수회원입니다가 실행되고 break된다.
			System.out.println("우수 회원입니다.");
			break;
		case 'B': 
		case 'b':
			System.out.println("일반 회원입니다.");
			break;
		default:								//case A,a,B,b 모두 해당사항이 안될때 마지막으로 실행됨
				System.out.println("손닙입니다.");
				
		}

	}

}
