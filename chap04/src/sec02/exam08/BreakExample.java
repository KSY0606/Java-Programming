package sec02.exam08;

public class BreakExample {

	public static void main(String[] args) {
		while(true) {					// while문에 true가 적혀있으면 무한히 반복됨
			int num = (int)(Math.random()*6) + 1;		// 1~6까지 임의의 정수를 만드는 코드가 num에 저장
			System.out.println(num);
			if(num == 6) {
				break;
			}
		}
			System.out.println("프로그램 종료");
	}

}
