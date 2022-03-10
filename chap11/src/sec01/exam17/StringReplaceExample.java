package sec01.exam17;

public class StringReplaceExample {

	public static void main(String[] args) {
		
		String oldstr = "자바는 객체 지향 언어입니다. 자바는 푸부한 API를 지원합니다.";
		String newstr = oldstr.replace("자바", "JAVA");	// 원본문자열의 "자바"를 "JAVA"로 변경해줌. 원본문자열은 바뀌지않음
		System.out.println(oldstr);
		System.out.println(newstr);

	}

}
