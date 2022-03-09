package sec01.exam08;

public class ClassExample {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Class clazz = Car.class; // CarŬ������ class��ü�� �����Ǿ� clazz�� ���Եȴ�
		
		Class clazz2 = Class.forName("sec01.exam08.Car");
		
		Car car = new Car();
		Class clazz3 = car.getClass();
		
		System.out.println(clazz == clazz2);
		System.out.println(clazz == clazz3);
		
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName()); // ��Ű���� ������ Ŭ���� �̸��� ��������
		System.out.println(clazz.getPackage().getName()); // ��Ű���̸��� ��µ�

	}

}
