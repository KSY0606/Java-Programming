package sec02.exam03;

public class Tire {
	//�ʵ�
	public int maxRotation; // �ִ� ȸ����
	public int accumulatedRotation;	// ����ȸ����
	public String location;	//	 Ÿ�̾��� ��ġ
	
	//������
	public Tire(String location, int maxRotation) { // �ܺηκ��� Ÿ�̾��� ��ġ, �ִ� ȸ������ �Է¹���
		this.location = location;
		this.maxRotation = maxRotation;
	}
	//�޼ҵ�
	public boolean roll() { // ȸ���� �� �� �ִٸ� true �� �� ���ٸ� false�� �����ϱ� ���� boolean�� ���
		++accumulatedRotation; // ȸ������ 1�� ������Ŵ
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " Tire ����: " + (maxRotation-accumulatedRotation)+ "ȸ");
			return true;
		} else {
			System.out.println("*** " + location + " Tire ��ũ***");
			return false;
			}
		}
	}

