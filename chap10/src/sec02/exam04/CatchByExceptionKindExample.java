package sec02.exam04;

public class CatchByExceptionKindExample {

	public static void main(String[] args) {
		
		String data1 = null;
		String data2 = null;
		
		try {
		data1 = args[0];
		data2 = args[1];
		
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);
		int result = value1 + value2;
		System.out.println(data1 + "+" + data2 + "=" + result);
	} catch(NumberFormatException e) {			// 18,20라인 ( )가 바뀌게 되면 컴파일에러 발생
	  System.out.println("실행 매개값의 수가 부족합니다.");
	} catch(Exception e) {
		System.out.println("숫자로 변환할 수 없습니다.");
	} finally {
		System.out.println("다시 실행하세요.");
	}
	}
}