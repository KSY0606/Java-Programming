package sec06.exam06;

public class CarExample {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		myCar.setSpeed(60); //  CarŬ������ �ʵ��� speed�� ����ȴ�
		System.out.println("����ӵ�: " + myCar.getSpeed());

		if(!myCar.isStop()) { // !�� �ٿ��ָ鼭 ���� �����̳İ� ���Ե�
			myCar.setStop(true);
		}
		System.out.println("����ӵ�: " + myCar.getSpeed());
	}

}
