package sec05.exam05;

public class Person {
	//  �ѹ� ���� ����Ǹ� �ٲ� �� ���� �տ� final�� �ٿ���
	final String nation = "Korean";	// ���� 
	final String ssn; 	//�ֹι�ȣó�� ��ü���� �ٸ� ���� �������ִ� final�ʵ�� �����ڿ��� �ʱ�ȭ �����ش�
	String name; // final�� ���� ������ ���� ������ �ٲ� �� �ִ�
	
	Person(String ssn, String name){
		this.ssn = ssn; // �ܺηκ��� ���� ���� ������ fianl�ʵ��� ssn�� ���� �������ְԵȴ�
		this.name = name;
	}
}
