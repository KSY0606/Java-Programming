package sec01.exam25;

public class ValueCompareExample {

	public static void main(String[] args) {
		Integer obj1 = 300; // �ڵ��ڽ�
		Integer obj2 = 300;
		
		System.out.println("==��� :" + (obj1 == obj2)); // �����ϴ� ���尴ü�� ������ �ٸ��� ������ false
		System.out.println("eqlus()��� :" + (obj1.equals(obj2)));

		
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println("==��� :" + (obj3 == obj4));
		System.out.println("eqlus()��� :" + (obj3.equals(obj4)));

	}

}
