package sec01.exam06;

public class ExitExample {

	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			System.out.println(i);
			if(i == 5) {
				//System.exit(0);  // i�� 5�� �Ǹ� �ý����� ������ 14������ �����������
				break; // for���� �������� 14������ �����
			}
		}
		
		System.out.println("������ �ڵ�"); 

	}

}
