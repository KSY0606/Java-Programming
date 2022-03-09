package sec01.exam08;

public class ClassExample {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Class clazz = Car.class; // Car클래스의 class객체가 생성되어 clazz에 대입된다
		
		Class clazz2 = Class.forName("sec01.exam08.Car");
		
		Car car = new Car();
		Class clazz3 = car.getClass();
		
		System.out.println(clazz == clazz2);
		System.out.println(clazz == clazz3);
		
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName()); // 패키지를 제외한 클래스 이름만 리턴해줌
		System.out.println(clazz.getPackage().getName()); // 패키지이름만 출력됨

	}

}
