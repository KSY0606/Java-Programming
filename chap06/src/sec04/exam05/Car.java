package sec04.exam05;

public class Car {
	//Field
	int speed;
	
	//Constuctor
	
	//Method
	int getspeed() { //�ܺηκ��� ���� ��������
		return speed; // �ʵ尪�� �а� �����ϵ��� �ۼ�
	}
	void keyTurnOn() {
		System.out.println("Ű�� �����ϴ�.");
	}
	
	void run() {
		for(int i=0; i<=50; i+=10) { // i�� 0���� �����ϰ�; i��50�����϶����� �ݺ��ǰ�,i�� �ݺ��ɶ����� 10�� �����Ѵ�
			speed = i; // speed�� ���� i�� ����
			System.out.println("�޸��ϴ�.(�ü�:" + speed + "km/h)");
		}
	}
}
