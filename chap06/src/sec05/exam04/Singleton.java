package sec05.exam04;

public class Singleton {
	private static Singleton singleton = new Singleton(); // �ʵ�(singleton)���� ��ü�� ������ ��¡�Ǿ��ִ�
	
	private Singleton() {}	 // ������ ����  �����ڿ� private�� �ֱ⶧���� �ܺο����� ������(Singleton)�� �̿��� �� ����
		
	static Singleton getInstance() {
		return singleton;
	}
}
