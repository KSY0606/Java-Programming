package sec01.exam04;

public class SuperSonicAirplaneExample {

	public static void main(String[] args) {
		
		SuperSonicAirplane sa = new SuperSonicAirplane();
		sa.takeOff();
		sa.fly(); // SuperSonicAirplane�� fly���� NORMAL�̱⶧���� Airplane�� fly�� ȣ��� 
		sa.flyMode = SuperSonicAirplane.SUPERSONIC; // �����带 SUPERSONIC���� ����
		sa.fly(); // �����ǵ� fly�� SuperSonicAirplaneŬ������ if���� true�� �Ǹ鼭 �����Ӻ����� ��µȴ�
		sa.flyMode = SuperSonicAirplane.NORMAL; // �ٽ� NORMAL���� �ٲ㺽 
		sa.fly();
		sa.land();

	}

}
