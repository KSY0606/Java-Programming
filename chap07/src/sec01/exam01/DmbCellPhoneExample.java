package sec01.exam01;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);

		System.out.println("모델: " + dmbCellPhone.model);
		System.out.println("색상: " + dmbCellPhone.color);
		System.out.println("채널: " + dmbCellPhone.channel);
		
		//DmbCellPhone이 CellPhone으로 물려받았던 6개의 메소드 작동여부 확인 
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.receiveVoice("안녕하세요 저는 홍길동입니다.");
		dmbCellPhone.sendVoice("네 안녕하세요.");
		dmbCellPhone.hangUp();
		
		// DmbCellPhone이 가지고 있는 메소드 호출
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
		
		
	}

}
