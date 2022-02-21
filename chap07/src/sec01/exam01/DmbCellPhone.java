package sec01.exam01;

public class DmbCellPhone extends CellPhone{ // CellPhone이 가지고 있는 필드와 메소드를 물려받게 됨
	//필드
	int channel; // 채널 정보를 저장할 수 있게 설정
	
	//생성자
	//외부에서 모델정보, 색상, 채널정보를 저장하기 위해 선언
	DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	//메소드    CellPhone이 가지고있는 메소드6개를 물려받았기때문에 가지고있는 상태
	void turnOnDmb() {
		System.out.println("채널" + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	void changeChannelDmb(int channle) {
		this.channel = channel;
		System.out.println("채널" + channel + "번으로 바꿉니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
	
}
