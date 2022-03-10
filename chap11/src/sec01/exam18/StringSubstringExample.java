package sec01.exam18;

public class StringSubstringExample {

	public static void main(String[] args) {
		
		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0, 6); // 주어진 시작과 끝 인덱스 사이의 문자열을 추출
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7); // 주어진 인덱스부터 끝까지 문자열을 추출
		System.out.println(secondNum);

	}

}
