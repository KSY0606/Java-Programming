package sec02.exam03;

public class HanKookTire extends Tire { // Trie�� ���
	//�ʵ�
	//������
	public HanKookTire(String location, int maxRotation) {
		super(location, maxRotation); // �θ��� ������ ȣ��
	}
	//�޼ҵ�
	@Override
	public boolean roll() { 
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " HanKookTire ����: " + (maxRotation-accumulatedRotation)+ "ȸ");
			return true;
		} else {
			System.out.println("*** " + location + " HanKookTire ��ũ***");
			return false;
	}
}
}