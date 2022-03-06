package sec01.exam01;

public class NullPointExceptionExample {

	public static void main(String[] args) {
		
		String data = null; // ex) String data = "ABC";를 입력해주면 됨
		System.out.println(data.toString()); // 객체가 없는 상태에서 참조변수를 가지고 사용할 경우 NullPointException이 발생한다

	}

}