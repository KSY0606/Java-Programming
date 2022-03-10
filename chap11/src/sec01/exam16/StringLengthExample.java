package sec01.exam16;

public class StringLengthExample {

	public static void main(String[] args) {
		
		String ssn = "7306241230123";
		int length = ssn.length(); // 전체문자열의 수를 리턴해서 length변수에 저장함
		if(length == 13) {
			System.out.println("주민번호 자리수가 맞습니다."); 
		} else {
			System.out.println("주민번호 자리수가 틀립니다.");
		}

	}

}
