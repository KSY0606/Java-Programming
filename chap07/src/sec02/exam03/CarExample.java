package sec02.exam03;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i=1; i<=5; i++) {
			int problemLocation = car.run(); // ���Ͱ��� �޵��� �ۼ�
			switch(problemLocation) {
				case 1: // Tire �ʵ忡 HanKookTire ����  Ÿ�Ժ�ȯ�� ����
					System.out.println("�տ��� HanKookTire�� ��ü");
					car.frontLeftTire = new HanKookTire("�տ���",15); 
					break;
				case 2:
					System.out.println("�տ����� KumhoTire�� ��ü");
					car.frontLeftTire = new KumhoTire("�տ�����",13); 
					break;
				case 3:
					System.out.println("�ڿ��� HanKookTire�� ��ü");
					car.frontLeftTire = new HanKookTire("�ڿ���",14); 
					break;
				case 4:
					System.out.println("�ڿ����� KumhoTire�� ��ü");
					car.frontLeftTire = new KumhoTire("�ڿ�����",17); 
					break;
			}
			
			System.out.println("---------------------------");
		}

	}

}
