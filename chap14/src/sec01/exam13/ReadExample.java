package sec01.exam13;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample {

	public static void main(String[] args) throws Exception{

		Reader reader = new FileReader("C:/Temp/test9.txt");
		
		char[] buffer = new char[5]; 
		
		int readCharNum = reader.read(buffer, 2, 3); // �Է½�Ʈ�����κ��� 3���� ���ڸ� �а� buffer[2],[3],[4]�� ���� ����
		if(readCharNum != -1) { // ���� ���ڰ� �ִٸ�
			for(int i = 0; i < buffer.length; i++) { // �迭 ��ü�� �а� ���
				System.out.println(buffer[i]);
			}
		}
		reader.close();
	}

}
