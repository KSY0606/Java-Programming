package sec01.exam07;

public class SwitchCharExample {

	public static void main(String[] args) {
		char grade = 'B'; //	���� grade�� B�� �ʱ�ȭ
		
		switch(grade) {
		case 'A':                    //����ִ� ��� �ƹ��͵� ������� ����.
		case 'a':					 // grade�� a�ϰ�� ���ȸ���Դϴٰ� ����ǰ� break�ȴ�.
			System.out.println("��� ȸ���Դϴ�.");
			break;
		case 'B': 
		case 'b':
			System.out.println("�Ϲ� ȸ���Դϴ�.");
			break;
		default:								//case A,a,B,b ��� �ش������ �ȵɶ� ���������� �����
				System.out.println("�մ��Դϴ�.");
				
		}

	}

}
