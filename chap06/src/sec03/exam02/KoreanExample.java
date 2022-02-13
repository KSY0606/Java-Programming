package sec03.exam02;

public class KoreanExample {

	public static void main(String[] args) {
		// Korean 클래스를 가지고 객체를 만듦.
		
		Korean k1 = new Korean("김자바", "012345-1234567");
		System.out.println(k1.nation);
		System.out.println(k1.name);
		System.out.println(k1.ssn);
		
		System.out.println("-------------");
		
		Korean k2 = new Korean("이자바", "950606-1234567");
		System.out.println(k2.nation);
		System.out.println(k2.name);
		System.out.println(k2.ssn);
		
		

	}

}
