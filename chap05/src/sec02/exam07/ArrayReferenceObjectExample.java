package sec02.exam07;

public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
		
		String[] strArray = new String[3];
		strArray[0] = "Java";
		strArray[1] = "Java";		// 문자열 리트럴이 같으면 동일한 String객체를 공유한다.
		strArray[2] = new String("Java"); 	// [0][1]인덱스에 저장된 번지와 다르다.
		
		System.out.println(strArray[0] == strArray[1]); // 인덱스0과 인덱스1이 참조하는 객체가 같냐고 물음.
		System.out.println(strArray[0] == strArray[2]);
		System.out.println(strArray[0].equals(strArray[2]));
	}

}
