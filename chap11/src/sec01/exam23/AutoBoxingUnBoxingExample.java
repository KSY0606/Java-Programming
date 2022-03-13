package sec01.exam23;

public class AutoBoxingUnBoxingExample {

	public static void main(String[] args) {
		
		Integer obj = 100; // 100이라는 기본값을 Integer객체로 포장해서 obj에 대입한다.
		System.out.println("value: " + obj.intValue());
		
		int value = obj;
		System.out.println("value: " + value);
		
		int result = obj + 100; // 자동 언박싱 
		System.out.println("result: " + result);

	}

}
