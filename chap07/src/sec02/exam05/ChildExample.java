package sec02.exam05;

public class ChildExample {

	public static void main(String[] args) {
		
		Parent parent = new Child(); // parent Ÿ���� ���� ����   �ڽİ�ü ����
		
		parent.field1 = "data1";  // parent���� ����� �͸� ��� ������
		parent.method1();
		parent.method2();
		
		// field2�� method3�� ����ϰ� �ʹٸ�
		Child child = (Child) parent;   // ���� ��ü���� Child�� ����Ÿ�Ժ�ȯ
		
		child.field2 = "data2";
		child.method3();

	}
}
