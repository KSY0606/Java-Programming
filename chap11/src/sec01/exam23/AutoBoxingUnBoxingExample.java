package sec01.exam23;

public class AutoBoxingUnBoxingExample {

	public static void main(String[] args) {
		
		Integer obj = 100; // 100�̶�� �⺻���� Integer��ü�� �����ؼ� obj�� �����Ѵ�.
		System.out.println("value: " + obj.intValue());
		
		int value = obj;
		System.out.println("value: " + value);
		
		int result = obj + 100; // �ڵ� ��ڽ� 
		System.out.println("result: " + result);

	}

}
