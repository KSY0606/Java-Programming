package sec05.exam04;

public class SingletonExample {

	public static void main(String[] args) {
		/* Singleton obj1 = new Singleton();
		   Singleton obj2 = new Singleton();  	private�� ���Ǿ� �����Ͽ��� �߻�	*/


		Singleton obj1 = Singleton.getInstance(); // �ʵ忡 ����� ������ �����ϰ� ��
		Singleton obj2 = Singleton.getInstance();
		
		// obj1,obj2�� �����ϴ� ��ü�� ������ Ȯ��
		if(obj1 == obj2) {
			System.out.println("���� Singleton ��ü�Դϴ�.");
		}else {
			System.out.println("�ٸ� Singleton ��ü�Դϴ�.");
		}
		
	}

}
