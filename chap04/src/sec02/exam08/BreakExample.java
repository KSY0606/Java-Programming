package sec02.exam08;

public class BreakExample {

	public static void main(String[] args) {
		while(true) {					// while���� true�� ���������� ������ �ݺ���
			int num = (int)(Math.random()*6) + 1;		// 1~6���� ������ ������ ����� �ڵ尡 num�� ����
			System.out.println(num);
			if(num == 6) {
				break;
			}
		}
			System.out.println("���α׷� ����");
	}

}
