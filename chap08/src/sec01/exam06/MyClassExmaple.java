package sec01.exam06;

public class MyClassExmaple {

	public static void main(String[] args) {
		
		System.out.println("1)--------------------------------");
		
		MyClass myClass1 = new MyClass();
		myClass1.rc.turnOn(); // myClass에 정의된 rc를 가지고 turnON setVolume을 해줌
		myClass1.rc.setVolume(5);
		
		System.out.println("2)--------------------------------");
		
		MyClass myClass2 = new MyClass(new Audio());
		
		System.out.println("3)--------------------------------");
		MyClass myClass3 = new MyClass();
		myClass3.methodA();
		
		System.out.println("4)--------------------------------");
		
		MyClass myClass4 = new MyClass();   // MyClass클래스의 MyClassB (turnOn, setVolume)가 실행됨
		myClass4.methodB(new Television());
		
	}

}
