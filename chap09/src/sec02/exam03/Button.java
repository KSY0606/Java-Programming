package sec02.exam03;

public class Button {   // Button에서 발생하는 이벤트를 처리하기위해 중첩인터페이스 선언
	static interface OnClickListener {
		void onClick();
	}
	
	OnClickListener listener;
	
	void setOnClickListener(	OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
}
