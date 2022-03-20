package sec01.exam11;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample {

	public static void main(String[] args) throws Exception{

		Reader reader = new FileReader("C:/Temp/test7.txt"); // ������ ������� test7.txt�� �ϴ� ���� ��� ���� �Է½�Ʈ���� ����
		
		while(true) {
			int data = reader.read(); // �� ���ھ� �б�
			if(data == -1) break; // ���� �P�� �������� ���
			System.out.println((char)data);
		}
		reader.close(); // �Է½�Ʈ���� ����
	}

}
