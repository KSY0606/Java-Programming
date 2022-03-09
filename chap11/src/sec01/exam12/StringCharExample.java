package sec01.exam12;

public class StringCharExample {

	public static void main(String[] args) {
		String ssn = "010625-1230123"; // 주민번호 뒷자리 첫번째자리는 인덱스7위치
		
		char sex = ssn.charAt(7);
		
		switch(sex) { // 인덱스7에 위치한 값에 따라 실행내용이 바뀜
			case '1':
			case '3':
				System.out.println("남자입니다.");
				break;
			case '2':
			case '4':
				System.out.println("여자입니다.");
				break;
		}

	}

}
