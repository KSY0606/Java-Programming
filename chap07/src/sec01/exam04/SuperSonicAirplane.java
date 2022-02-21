package sec01.exam04;

public class SuperSonicAirplane extends Airplane { // Airplane을 상속함
	// 비행모드를 상수로 2개 선언
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
	@Override
		public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속비행합니다.");
			
		}else {
			super.fly(); 
		}
	}
}
