package sec03.exam05;

public class OperationPromotionExample {

	public static void main(String[] args) {

		byte byteValue1 = 10;
		byte byteValue2 = 20;
		int intValue1 = byteValue1 + byteValue2; // byte byteValue3 = byteValue1 + byteValue2;는 컴파일 에러 
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		int intValue2 = charValue1 + charValue2; // char charValue3 = charValue1 + charValue2;는 컴파일 에러
		System.out.println("유니코드: " + charValue1);
		System.out.println("출력문자: " + (char)intValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3/4;
		System.out.println(intValue4);
		
		int intValue5 = 10;
		double doubleValue = intValue5 / 4.0;  // int intValue6 = 10 / 4.0;는 컴파일 에러 
		System.out.println(doubleValue);
		
		int x = 1;
		int y = 2;
		double resurt = x / (double) y;
		System.out.println(resurt);
		
	}

}
