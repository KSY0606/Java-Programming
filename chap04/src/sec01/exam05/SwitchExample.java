package sec01.exam05;

public class SwitchExample {

	public static void main(String[] args) {
		// chap04 sec01.exam04 (IfDiceExample.java)를 Switch문으로 변형한 경우.
		
		int num = (int)(Math.random()*6) + 1;  // 주사위 번호를 하나 뽑아내는 코드
		
		switch(num) {
		case 1:
			System.out.println("1번이 나왔습니다");
			break;
		case 2:
			System.out.println("2번이 나왔습니다");
			break;
		case 3:
			System.out.println("3번이 나왔습니다");
			break;
		case 4:
			System.out.println("4번이 나왔습니다");
			break;
		case 5:
			System.out.println("5번이 나왔습니다");
			break;
		default:
			System.out.println("6번이 나왔습니다");
			break;  // 6번이 나올경우 뒤로 더이상 코드가 없기때문에 마지막의 break는 생략가능.
		}					// num의 숫자가 정해지면 그에 맞는 switch문이 실행됨.
	}
}
