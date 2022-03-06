package sec02.exam01;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		/* String str = null;
		System.out.println(str.length()); nullpointerException 발생*/
		
		try {
			Class clazz = Class.forName("java.lang.String"); // 예외가 발생하지않는다면 "정상실행"이 출력된다
			System.out.println("정상실행");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다."); // 예외가 발생하게되면 13라인이 실행됨 ex)10라인 ("java.lang.String"2)로 작성되면 예외발생
		}

	}

}
