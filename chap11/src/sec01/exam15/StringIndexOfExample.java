package sec01.exam15;

public class StringIndexOfExample {

	public static void main(String[] args) {
			
		String subject = "�ڹ� ���α׷���";
			
			int location = subject.indexOf("���α׷���"); 
			System.out.println(location);  // �Ű����� �־��� ���ڿ��� ���۵Ǵ� �ε����� �����Ѵ�.
			
			if(subject.indexOf("�ڹ�") != -1) {
				System.out.println("�ڹٿ� ���õ� å�̱���");
			} else {
				System.out.println("�ڹٿ� ���þ��� å�̱���");
			}
			
			if(subject.contains("�ڹ�")) { // indexOf�� contains �־��� ���ڿ��� ã�µ� ���ȴ�
				System.out.println("�ڹٿ� ���õ� å�̱���");
			} else {
				System.out.println("�ڹٿ� ���þ��� å�̱���");
			}

	}

}
