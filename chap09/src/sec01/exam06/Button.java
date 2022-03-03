package sec01.exam06;

public class Button {
	
	OnClickListener listener;
	
	// �ܺηκ��� ������ü�� ������ �ֵ��� ���͸޼ҵ� �ۼ�
	void setListener(OnClickListener listener) {
		this.listener = listener;
	}
	void click() {
		listener.onClick();
	}
	// ��ư�� Ŭ�������� ���೻���� �������ִ� ������ü�� ������ؼ� �������̽��� ������
	static interface OnClickListener {
		void onClick();
	}
}
