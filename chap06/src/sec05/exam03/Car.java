package sec05.exam03;

public class Car {
	int speed; // �ν��Ͻ� �ʵ� 
	
	void run() {  // �ν��Ͻ� �޼ҵ�
		System.out.println(speed + "���� �޸��ϴ�.");
	}
	public static void main(String[] args) { 
		
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run(); 
		
		/* speed = 60;
			run();  �� ����ϱ����ؼ� 4���� int �տ� static 6���� void �տ� static�� �ٿ��ָ� ��� �����ϴ�*/
	}
}
