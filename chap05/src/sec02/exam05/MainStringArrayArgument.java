package sec02.exam05;

public class MainStringArrayArgument {

	public static void main(String[] args) {
		if(args.length != 2) {		// �Էµ� �������� ������ 2���� �ƴ� ���
			System.out.println("���� ���� �����մϴ�.");
			System.exit(0);			// ���α׷� ��������
		}
		
		String strNum1 = args[0];		// ù��° ������ ���
		String strNum2 = args[1];		// �ι�° ������ ���
		
		int num1 = Integer.parseInt(strNum1);	// ���ڿ��� ������ ��ȯ
		int num2 = Integer.parseInt(strNum2);	// ���ڿ��� ������ ��ȯ
		
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
			// ���� �Ű����� �����ʰ� ������ �ϰԵǸ� args������ �����ϴ� �迭�� ���̴� 0�̱� ������ 7������ true�� �Ǹ鼭 8������ ����ǰ� �ý����� ����ȴ�.
			// Run-Run Configurations���� ���ڸ� �Է����ָ� result���� ��µȴ�.
	}

}