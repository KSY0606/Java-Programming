package sec01.exam11;

import java.io.IOException;

public class KeyboardToStringExample {

	public static void main(String[] args) throws Exception {
		
		byte[] bytes = new byte[100]; // ���� 100¥�� ����Ʈ�迭 ����
		
		System.out.print("�Է�: ");
		int readByteNo = System.in.read(bytes);
		
		String str = new String(bytes, 0, readByteNo-2); // �ԷµǴ� ���� \n, \r�� ���ܽ�Ű������ -2�� ���ش�
		System.out.println(str);

	}

}
