package sec01.exam01;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");  // strVar1 strVar2의 참조가 같아서 출력됨
		}else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}

		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음");  // 문자열이 같이 때문에 출력됨.
		}
		
		String strVar3 = new String("신민철");
		String strVar4 = new String("신민철");   // strVar3과 strVar4가 참조하는 객체가 다르므로 false로 25라인 출력됨
		
		if(strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음"); 
		}else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}

		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음");
				// strVar3과 strVar4가 다른 객체를 참조하지만 내부문자열은 같으므로 28라인은 true로 출력됨.
	}

	}
}
