package sec01.exam02;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		
		HashMap<Key, String>hashMap = new HashMap<Key, String>();

		hashMap.put(new Key(1), "value1");
		hashMap.put(new Key(2), "vlaue2");
		hashMap.put(new Key(1), "vlaue3");	// key�� ���ٸ� ������ key�� ���ְ� ���ο� key�� ������
		
		System.out.println(hashMap.size()); // size�� hashMap�� Ű�Ͱ��� ���� � ����Ǿ��ִ��� �˱� ����
		
	}

}
