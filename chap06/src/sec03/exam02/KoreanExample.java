package sec03.exam02;

public class KoreanExample {

	public static void main(String[] args) {
		// Korean Ŭ������ ������ ��ü�� ����.
		
		Korean k1 = new Korean("���ڹ�", "012345-1234567");
		System.out.println(k1.nation);
		System.out.println(k1.name);
		System.out.println(k1.ssn);
		
		System.out.println("-------------");
		
		Korean k2 = new Korean("���ڹ�", "950606-1234567");
		System.out.println(k2.nation);
		System.out.println(k2.name);
		System.out.println(k2.ssn);
		
		

	}

}
