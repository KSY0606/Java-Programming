package sec04.exam03;

public class CarExample {

	public static void main(String[] args) {
		
		Car myCar = new Car(); // Car ��ü ����
		
		myCar.setGas(5); // setGas�޼ҵ�� int�� �Ű����� ����
		
		boolean gasState = myCar.isLeftGas(); // ���� ���ᰡ �����ִٸ� true �������� �ʴٸ� false
		if(gasState) {
			System.out.println("����մϴ�.");
			myCar.run();
		}

		if(myCar.isLeftGas()) { // myCar�� �����ϴ� ��ü�� isLeftGas��� �޼ҵ带 ȣ���ϰ� ���ϰ��� true��� ����ȴ�
			System.out.println("gas�� ������ �ʿ䰡 �����ϴ�.");		// false��� 19������ ����ȴ�
		}else {
			System.out.println("gas�� �����ϼ���.");
		}
	}

}
