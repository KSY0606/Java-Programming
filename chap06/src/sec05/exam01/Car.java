package sec05.exam01;

public class Car {
	//Field         
	String model;  // model�� �ν��Ͻ��ʵ尡 ��    ��ü�� �־�߸� �����ϴ� �ʵ�
	int speed; // speed�� �ν��Ͻ��ʵ�
	
	//Constructor
	Car(String model){
		this.model = model; // Field�� �̸��� �Ű������̸��� model�̱⶧���� this.�� �ٿ��ش�
	}
	
	// Method
	void setSpeed(int speed) {
		this.speed = speed; // this.�� �ٿ����������� �Ű������� ���� �Ű������� �����ϴ°� ��
	}
	
	void run() {
		for(int i=10; i<=50; i+=10) {
			setSpeed(i); 
			System.out.println(model + "�� �޸��ϴ�.(�ü�:" + speed + "km/h)");
		}
	}
}
