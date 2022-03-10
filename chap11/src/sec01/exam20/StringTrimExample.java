package sec01.exam20;

public class StringTrimExample {

	public static void main(String[] args) {
		
		String tel1 = "   02";
		String tel2 = "123   ";
		String tel3 = "    123   ";
		
		String tel = tel1.trim() + tel2.trim() + tel3.trim(); // 문자열의 앞뒤 공백을 제거해준다 trim
		System.out.println(tel);

	}

}
