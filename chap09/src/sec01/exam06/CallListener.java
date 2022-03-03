package sec01.exam06;

public class CallListener implements Button.OnClickListener {// Button에 선언되어있는 중첩인터페이스로 구현을 해줘야함

	@Override
	public void onClick() {
		System.out.println("전화를 겁니다.");
		
	}

}
