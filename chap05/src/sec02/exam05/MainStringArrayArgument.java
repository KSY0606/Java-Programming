package sec02.exam05;

public class MainStringArrayArgument {

	public static void main(String[] args) {
		if(args.length != 2) {		// 입력된 데이터의 개수가 2개가 아닐 경우
			System.out.println("값의 수가 부족합니다.");
			System.exit(0);			// 프로그램 강제종료
		}
		
		String strNum1 = args[0];		// 첫번째 데이터 얻기
		String strNum2 = args[1];		// 두번째 데이터 얻기
		
		int num1 = Integer.parseInt(strNum1);	// 문자열을 정수로 변환
		int num2 = Integer.parseInt(strNum2);	// 문자열을 정수로 변환
		
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
			// 실행 매개값을 주지않고 실행을 하게되면 args변수가 참조하는 배열의 길이는 0이기 때문에 7라인이 true가 되면서 8라인이 실행되고 시스템이 종료된다.
			// Run-Run Configurations에서 숫자를 입력해주면 result값이 출력된다.
	}

}
