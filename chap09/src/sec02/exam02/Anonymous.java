package sec02.exam02;

public class Anonymous {
	RemoteControl field = new RemoteControl() {
		
		public void turnOn() {
			System.out.println("TV¸¦ ÄÕ´Ï´Ù");
		};
		public void turnOff() {
			System.out.println("TV¸¦ ²ü´Ï´Ù");
		};
	}; 
	
	void method1() {
		RemoteControl localVar = new RemoteControl() {
			
			public void turnOn() {
				System.out.println("Audio¸¦ ÄÕ´Ï´Ù.");
			}
			public void turnOff() {
				System.out.println("Audio¸¦ ²ü´Ï´Ù.");
			}
		};
		
		localVar.turnOn();
		localVar.turnOff();
	}
	
	void method2(RemoteControl rc) {
		 rc.turnOn();
		 rc.turnOff();
	}
}
