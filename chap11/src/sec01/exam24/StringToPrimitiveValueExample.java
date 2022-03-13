package sec01.exam24;

public class StringToPrimitiveValueExample {

	public static void main(String[] args) {
		
		int value1 = Integer.parseInt("10"); // 문자열10이 int타입으로 변환되어 vaule에 저장된다
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println("value1: " + value1);
		System.out.println("value2: " + value2);
		System.out.println("value3: " + value3);
		
		
		
	}

}
