package sec02.exam02;

public class ChildExample {

	public static void main(String[] args) {
		 Child child = new Child(); // ��ü ����
		 
		 Parent parent = child; // �ڽİ�ü�� �θ�Ÿ�Կ� ����
		 
		 parent.method1();
		 parent.method2(); // �����ǵ� �޼ҵ尡 ȣ���
		 // parent.method3(); parentŸ�Կ��� method3�� ��������ʾұ⶧���� �ȵ�
		 // Ÿ�Ժ�ȯ�� �Ǿ��⶧���� child.method3();�� �����ϴ�

	}

}
