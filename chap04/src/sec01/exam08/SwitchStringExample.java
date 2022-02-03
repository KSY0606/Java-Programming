package sec01.exam08;

public class SwitchStringExample {

	public static void main(String[] args) {
		String position = "과장"; 			// position에 "과장"을 초기화함.
		
		switch(position) {
		case "부장":
			System.out.println("700만원");	// position이 "부장"일 경우 700만원이 실행된후 break됨.
			break;
		case "과장":
			System.out.println("500만원");
			break;
		default:
			System.out.println("300만원");
			
		}
	}
}
