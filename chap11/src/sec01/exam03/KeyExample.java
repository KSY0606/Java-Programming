package sec01.exam03;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		
		HashMap<Member, String>hashMap2 = new HashMap<Member, String>();
		
		hashMap2.put(new Member("fall"), "value1");
		hashMap2.put(new Member("winter"), "vlaue2");
		hashMap2.put(new Member("fall"), "vlaue3");
		
		System.out.println(hashMap2.size());
	}

}
