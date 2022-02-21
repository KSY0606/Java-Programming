package sec01.exam01;

public class CellPhone {
	//Field
	String model;  // private를 사용하게 되면  상속대상에서 제외됨
	String color;
	
	//constructor
	
	//Method			메소드도 마찬가지로 private를 사용하게 되면  상속대상에서 제외됨
	void powerOn() { System.out.println("전원을 겹니다."); }
	void powerOff() { System.out.println("전원을 끕니다."); }
	void bell() { System.out.println("벨이 울립니다."); }
	void sendVoice(String message) { System.out.println("자기: " + message); }
	void receiveVoice(String message) { System.out.println("상대방: " + message); }
	void hangUp() { System.out.println("전화를 끊습니다."); }
	
}
