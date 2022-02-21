package sec01.exam04;

public class SuperSonicAirplaneExample {

	public static void main(String[] args) {
		
		SuperSonicAirplane sa = new SuperSonicAirplane();
		sa.takeOff();
		sa.fly(); // SuperSonicAirplane의 fly모드는 NORMAL이기때문에 Airplane의 fly가 호출됨 
		sa.flyMode = SuperSonicAirplane.SUPERSONIC; // 비행모드를 SUPERSONIC으로 지정
		sa.fly(); // 재정의된 fly는 SuperSonicAirplane클래스의 if문이 true가 되면서 초음속비행이 출력된다
		sa.flyMode = SuperSonicAirplane.NORMAL; // 다시 NORMAL모드로 바꿔봄 
		sa.fly();
		sa.land();

	}

}
