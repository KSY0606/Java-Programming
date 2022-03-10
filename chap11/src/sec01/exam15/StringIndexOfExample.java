package sec01.exam15;

public class StringIndexOfExample {

	public static void main(String[] args) {
			
		String subject = "자바 프로그래밍";
			
			int location = subject.indexOf("프로그래밍"); 
			System.out.println(location);  // 매개값이 주어진 문자열이 시작되는 인덱스를 리턴한다.
			
			if(subject.indexOf("자바") != -1) {
				System.out.println("자바와 관련된 책이군요");
			} else {
				System.out.println("자바와 관련없는 책이군요");
			}
			
			if(subject.contains("자바")) { // indexOf와 contains 주어진 문자열을 찾는데 사용된다
				System.out.println("자바와 관련된 책이군요");
			} else {
				System.out.println("자바와 관련없는 책이군요");
			}

	}

}
