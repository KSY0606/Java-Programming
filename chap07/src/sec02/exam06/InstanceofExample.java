package sec02.exam06;

public class InstanceofExample {

	public static void main(String[] args) {

		Parent parentA = new Child(); // Child ��ü ����
		method1(parentA);  // parentA�� 11���� parent�� ���ԵǾ� true�� �ȴ�
		
		Parent parentB = new Parent();
		method1(parentB); // 11�������� ���ԵǴ°� ���������� 15���ο����� false�� ���� else�� ����ȴ�
	}
								// parent �Ű����� ���� 
	public static void method1(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("method1 - Child�� ��ȯ ����");
		} else {
			System.out.println("method1 - Child�� ��ȯ���� ����");
		}
	}
}