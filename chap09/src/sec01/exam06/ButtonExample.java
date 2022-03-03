package sec01.exam06;

public class ButtonExample {

	public static void main(String[] args) {
		
		Button btn1 = new Button();
		btn1.setListener(new CallListener());
		btn1.click();

		Button btn2 = new Button();
		btn2.setListener(new MessageListener());
		btn2.click();
	}

}
