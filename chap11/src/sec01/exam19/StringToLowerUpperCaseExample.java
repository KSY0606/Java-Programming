package sec01.exam19;

public class StringToLowerUpperCaseExample {

	public static void main(String[] args) {
		
		String str1 = "Java Programming";
		String str2 = "JAVA Programming"; // 대소문자를 구분하기떄문에 str1, str2는 서로 다른 문자열임
		System.out.println(str1.equals(str2));
		
		String lowerstr1 = str1.toLowerCase(); // str1이 참조하는 문자열을 전부 소문자로 바꿔 새로운 문자열을 만들어줌
		String lowerstr2 = str2.toLowerCase();
		
		System.out.println(lowerstr1.equals(lowerstr2));
		
		System.out.println(str1.equalsIgnoreCase(str2)); // 대소문자를 맞춰주지않아도 equalsIgnoreCase를 사용하면 위 과정을 생략할 수 있다

	}

}
