package sec01.exam02;

public class IfElseExample {

	public static void main(String[] args) {
		int score = 85;  // score�� 85�� �ʱ�ȭ
		
		if(score>=90) {   
			System.out.println("������ 90���� Ů�ϴ�.");  
			System.out.println("����� A�Դϴ�.");       // if���� ���ǽ��� false�̹Ƿ�
		}else {										 // else���� �ڵ尡 ����ȴ�.
			System.out.println("������ 90���� �۽��ϴ�.");
			System.out.println("����� B�Դϴ�.");
		}
		
		System.out.println("����"); // �� �ڵ尡 ����� �� �� �ڵ尡 ����ȴ�   
	
		
	} 
} 
