package sec01.exam04;

public class IfDiceExample {

	public static void main(String[] args) {
		int num = (int)(Math.random()*6) + 1; // 주사위 1~6이기 때문에 *6, Math.random의 범위가 0.0<= ~ <6.0이기때문에 +1을 해준다. 
		
		if(num==1) {
			System.out.println("1번이 나왔습니다.");
		}else if(num==2) {
			System.out.println("2번이 나왔습니다.");
		}else if(num==3) {
			System.out.println("3번이 나왔습니다.");
		}else if(num==4) {
			System.out.println("4번이 나왔습니다.");
		}else if(num==5) {
			System.out.println("5번이 나왔습니다.");
		}else { 
			System.out.println("6번이 나왔습니다.");
		}
				// 실행을 하면 6라인에서 num값이 정해지고 true,false를 거쳐 이에 맞는 조건문이 실행된다.
	}

}
