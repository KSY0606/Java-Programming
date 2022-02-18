package sec05.exam04;

public class Singleton {
	private static Singleton singleton = new Singleton(); // 필드(singleton)에는 객체의 번지가 저징되어있다
	
	private Singleton() {}	 // 생성자 선언  생성자에 private이 있기때문에 외부에서는 생성자(Singleton)을 이용할 수 없다
		
	static Singleton getInstance() {
		return singleton;
	}
}
