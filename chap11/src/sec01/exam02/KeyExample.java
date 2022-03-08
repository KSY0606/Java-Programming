package sec01.exam02;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		
		HashMap<Key, String>hashMap = new HashMap<Key, String>();

		hashMap.put(new Key(1), "value1");
		hashMap.put(new Key(2), "vlaue2");
		hashMap.put(new Key(1), "vlaue3");	// key가 같다면 이전의 key를 없애고 새로운 key를 저장함
		
		System.out.println(hashMap.size()); // size는 hashMap에 키와값의 쌍이 몇개 저장되어있는지 알기 위함
		
	}

}
