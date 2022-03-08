package sec01.exam05;

public class SmartPhoneExample {

	public static void main(String[] args) {
		
		SmartPhone myPhone = new SmartPhone("구글", "안드로이드"); // SmartPhone의 company가 구글, os가 안드로이드가 됨
		
		String strobj = myPhone.toString();
		
		System.out.println(strobj);
		

	}

}
