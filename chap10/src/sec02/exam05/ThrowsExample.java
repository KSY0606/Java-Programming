package sec02.exam05;

public class ThrowsExample {

	public static void main(String[] args) {
		
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}

	}

	public static void findClass() throws ClassNotFoundException { // findClass를 호출하는 곳으로 예외를 던지게 됨 (8라인으로 가게 됨)
		Class clazz = Class.forName("java.lang.String2"); // String2라는 클래스는 없어 예외가 발생한다
	}
}
