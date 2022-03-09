package sec01.exam13;

public class StringEqualsExample {

	public static void main(String[] args) {
		
		String strVar1 = new String("자바");
		String strVar2 = "자바";
		
		if(strVar1 == strVar2) { // ==이기때문에 두 변수에 저장되어있는 번지가 같은지 묻는것
			System.out.println("같은 String 객체를 참조");
		} else {
				System.out.println("다른 String 객체를 참조");  
			}
		
		if(strVar1.equals(strVar2)) { // 문자열이 같은지 묻는것
			System.out.println("같은 문자열을 가짐");
		} else {
			System.out.println("다른 문자열을 가짐");  
		}
		}
	}