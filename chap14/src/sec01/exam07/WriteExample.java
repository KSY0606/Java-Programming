package sec01.exam07;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample {

	public static void main(String[] args) throws Exception{

		Writer writer = new FileWriter("C:/Temp/test7.txt"); // ������ �������� test7.txt�� �ϴ� ���ڱ������ ��½�Ʈ���� ����
		
		char a = 'A';
		char b = 'B';
		char c = 'C';
		
		writer.write(a); // �� ���ھ� ���
		writer.write(b);
		writer.write(c);
		
		writer.flush(); // ��� ���ۿ� �ܷ��ϴ� ��� ���ڸ� ���
		writer.close(); // ��� ��Ʈ���� ����
	}

}
