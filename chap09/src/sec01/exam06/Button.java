package sec01.exam06;

public class Button {
	
	OnClickListener listener;
	
	// 외부로부터 구현객체를 받을수 있도록 세터메소드 작성
	void setListener(OnClickListener listener) {
		this.listener = listener;
	}
	void click() {
		listener.onClick();
	}
	// 버튼을 클릭했을떄 실행내역을 가지고있는 구현객체를 얻기위해서 인터페이스를 선언함
	static interface OnClickListener {
		void onClick();
	}
}
