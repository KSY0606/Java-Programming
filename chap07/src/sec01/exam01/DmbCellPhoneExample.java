package sec01.exam01;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		
		DmbCellPhone dmbCellPhone = new DmbCellPhone("�ڹ���", "����", 10);

		System.out.println("��: " + dmbCellPhone.model);
		System.out.println("����: " + dmbCellPhone.color);
		System.out.println("ä��: " + dmbCellPhone.channel);
		
		//DmbCellPhone�� CellPhone���� �����޾Ҵ� 6���� �޼ҵ� �۵����� Ȯ�� 
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("��������");
		dmbCellPhone.receiveVoice("�ȳ��ϼ��� ���� ȫ�浿�Դϴ�.");
		dmbCellPhone.sendVoice("�� �ȳ��ϼ���.");
		dmbCellPhone.hangUp();
		
		// DmbCellPhone�� ������ �ִ� �޼ҵ� ȣ��
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
		
		
	}

}
